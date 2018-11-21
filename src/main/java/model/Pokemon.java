package model;

import javax.ws.rs.core.MediaType;

import com.google.gson.annotations.SerializedName;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class Pokemon {

	@SerializedName("name")
	private String name;
	
	@SerializedName("url")
	String url;
	
	public Pokemon(String name, String url) {
		this.name=name;
		this.url=url;
	}
	

	public String getName() {
		return name.replace('-', ' ');
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		String str=url.substring(0, url.length()-1);
		return str.substring(str.lastIndexOf("/")+1);
	}
	
	public String getPic() {
		return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+getId()+".png";
	}
	
}
