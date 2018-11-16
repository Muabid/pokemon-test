package pokemons;

import com.google.gson.annotations.SerializedName;

public class Album {

	@SerializedName("front_default")
	private String frontDefault;

	public Album(String frontDefault) {
			this.frontDefault=frontDefault;
	}
	
	public String getFrontDefault() {
		return frontDefault;
	}

	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}
	
	
	
}
