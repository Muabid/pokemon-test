package pokemons;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class PokemonRepo {
	static private Client client = Client.create() ;
	
	
	
	
	public  List<Pokemon> pokemons() {
		  ClientResponse response = apiResponse("pokemon/");  
		  

	    	if (response.getStatus() != 200) {
	    		throw new RuntimeException("Failed : HTTP error code : "
	    		+ response.getStatus());
	    	}
	    	
	    	String json = response.getEntity(String.class);
	
		 return new Gson().fromJson(json, PokemonResponse.class).getPokemons();
	}
	
	
	public List<Pokemon> pokemonsWithSubName(String subname){
		return pokemons().stream().filter(p->p.getName().contains(subname)).collect(Collectors.toList());
	}
	
	
	private ClientResponse apiResponse(String path) {
		return client.resource("https://pokeapi.co/api/v2").path(path).
		  header("user-agent", "").accept(MediaType.APPLICATION_JSON).
		  get(ClientResponse.class);
	}
	
	
}
