package client;

import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

import model.Pokemon;

public class PokemonApi {

	private Client client=Client.create();
	
	
	
	public List<Pokemon> pokemons() {
		ClientResponse res=apiResponse("pokemon/");
		
		String str=res.getEntity(String.class);
		
		return new Gson().fromJson(str, PokeResponse.class).getPokemons();
		
	}
	
	
	public Pokemon getPokemon(String name) {
		ClientResponse res=apiResponse("pokemon/"+name+"/");
		String str=res.getEntity(String.class);
		
		return new Gson().fromJson(str, Pokemon.class);
		
	}
	
	
	private ClientResponse apiResponse(String path) {
		ClientResponse response= client.resource("https://pokeapi.co/api/v2").path(path).
		  header("user-agent", "").accept(MediaType.APPLICATION_JSON).
		  get(ClientResponse.class);
		
		if (response.getStatus() != 200) {
    		throw new RuntimeException("Failed : HTTP error code : "
    		+ response.getStatus());
    	}
		
		return response;
	}
	
	
	
	
}
