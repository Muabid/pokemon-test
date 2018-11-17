package web;

import controllers.HomeController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import web.spark.BooleanHelper;
import web.spark.HandlebarsTemplateEngineBuilder;

public class Router 
{
	public static void configure() 
	{
		HandlebarsTemplateEngine engine = HandlebarsTemplateEngineBuilder
				.create()
				.withDefaultHelpers()
				.withHelper("isTrue", BooleanHelper.isTrue)
				.build();

		Spark.staticFiles.location("/public");
		Spark.get("/",HomeController::index,engine);		
	}

}