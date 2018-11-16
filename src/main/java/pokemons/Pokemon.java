package pokemons;

import javax.ws.rs.core.MediaType;

import com.google.gson.annotations.SerializedName;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class Pokemon {

	@SerializedName("name")
	private String name;
	
	@SerializedName("sprites")
	private Album pics;
	
	public Pokemon(String name, Album pics) {
		this.name=name;
		this.pics=pics;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePic() {
		return pics.getFrontDefault();
	}
	
}
