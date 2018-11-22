package pokemons;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.*;

import model.Pokemon;
import utils.PokeRepo;

public class PokemonTest {
	Pokemon bulbasaur;
	PokeRepo repo;
	
	@Before
	public void init() {
		repo=new PokeRepo();
		bulbasaur=repo.searchBySubName("bulbasaur").get(0);
	}
	
	@Test
	public void elIdDeBulbasaurEs1(){
		assertEquals("1",bulbasaur.getId());
	}
	
	
	
	
}
