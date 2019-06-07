package co.grandcircus.chuck;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ListOfJokes {
	
	private List<Joke> value;
	// private Joke[] value;

	public ListOfJokes() {
		
	}
	public ListOfJokes(List<Joke> value) {
		this.value = value;
	}
	public List<Joke> getValue() {
		return value;
	}
	public void setValue(List<Joke> value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "ListOfJokes [value=" + value + "]";
	}
	
}
