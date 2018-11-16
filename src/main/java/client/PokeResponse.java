package client;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import com.google.gson.annotations.SerializedName;

import model.Pokemon;

public class PokeResponse {

	@SerializedName("results")
	private List<Pokemon> pokemons;

	public PokeResponse(List<Pokemon> pokemons) {
		this.pokemons=pokemons;
	}
	
	public 	 List<Pokemon> getPokemons(){
		return pokemons;
	}
	
}
