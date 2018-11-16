import org.junit.Before;
import org.junit.Test;

import pokemons.Pokemon;
import pokemons.PokemonRepo;

import static junit.framework.Assert.*;

import java.util.List;

public class RepoPokemonsTest {

	
	PokemonRepo repo;
	@Before
	public void init() {
		repo=new PokemonRepo();
	}
	
	
	@Test
	public void obtenerPikachu() {
		List<Pokemon> pokemons=repo.pokemonsWithSubName("pikachu");
		assertEquals("pikachu",pokemons.stream().findAny().get().getName());
	}
	
	
	@Test
	public void listaVaciaPorNombreInexistente() {
		List<Pokemon> pokemons=repo.pokemonsWithSubName("safafshoajsoifj");
		assertEquals(0, pokemons.size());
	}
	
	
}
