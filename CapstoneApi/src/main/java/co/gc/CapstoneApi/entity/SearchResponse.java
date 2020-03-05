package co.gc.CapstoneApi.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchResponse {
	
	@JsonProperty("Search")
	private List<Movie> search;

	public List<Movie> getSearch() {
		return search;
	}

	public void setSearch(List<Movie> search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "SearchResponse [Search=" + search + "]";
	}

	
	
	
}
