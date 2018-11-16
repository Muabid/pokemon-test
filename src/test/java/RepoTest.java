import java.util.List;

import org.junit.Before;
import org.junit.Test;

import client.PokemonApi;

import static junit.framework.Assert.*;
import model.Pokemon;
import utils.PokeRepo;

 
public class RepoTest {

	
	PokeRepo repo;
	@Before
	public void init() {
		repo=new PokeRepo();
	}
	
	
	@Test
	public void SeTraeLosPokemones() {
		List<Pokemon> p=repo.getAll();
		assertNotNull(p);
	}
	
	@Test
	public void filtraPorPikachu() {
		List<Pokemon> pokemons = repo.searchBySubName("pikachu");
		Pokemon pika=pokemons.get(0);
		assertEquals("pikachu", pika.getName());
	}
	
	
	@Test
	public void filtroPorNombreInexistenteYNoTraeNada() {
		List<Pokemon> pokemons = repo.searchBySubName("safafafss");
		assertEquals(0, pokemons.size());
		
	}
	
}
