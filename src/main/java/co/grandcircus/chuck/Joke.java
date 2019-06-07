package co.grandcircus.chuck;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Joke {
	
	private Integer id;
	private String joke;
		
	public Joke() {
		
	}

	public Joke(Integer id, String joke) {
		this.id = id;
		this.joke = joke;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJoke() {
		return joke;
	}

	public void setJoke(String joke) {
		this.joke = joke;
	}

	@Override
	public String toString() {
		return "Joke [id=" + id + ", joke=" + joke + "]";
	}
	
}