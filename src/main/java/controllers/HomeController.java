package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Pokemon;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import utils.PokeRepo;

public class HomeController {

	public static ModelAndView index(Request req, Response res) {
		Map<String,Object> view=new HashMap<>();
		
		return new ModelAndView(view, "index.hbs");
	}
	
	public static ModelAndView search(Request req, Response res) {
		Map<String,Object> view=new HashMap<>();
		String subname= req.queryParams("nam");
		List<Pokemon> pokemons= new PokeRepo().searchBySubName(subname);
		view.put("pokemons",pokemons);
		return new ModelAndView(view, "index.hbs");

	}
}
