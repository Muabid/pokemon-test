package pokemons;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PokemonResponse {

	@SerializedName("results")
	private List<Pokemon> pokemons;

	public List<Pokemon> getPokemons() {
		return pokemons;
	}
	
	
}
