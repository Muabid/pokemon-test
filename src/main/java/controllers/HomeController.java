package controllers;

import java.util.HashMap;
import java.util.Map;



import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class HomeController {

	public static ModelAndView index(Request req, Response res) {
		Map<String,Object> view=new HashMap<>();
		
		return new ModelAndView(view, "index.hbs");
	}
}
