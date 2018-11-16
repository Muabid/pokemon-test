package utils;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import client.PokemonApi;
import model.Pokemon;

public class PokeRepo {
	
	PokemonApi pokeApi = new PokemonApi();
	
	public List<Pokemon> getAll() {
		
		return pokeApi.pokemons();
	}
	
	public List<Pokemon> searchBySubName(String name){
		return pokeApi.pokemons().stream().filter(p->p.getName().contains(name)).collect(Collectors.toList());
	}
	
	
	
}
