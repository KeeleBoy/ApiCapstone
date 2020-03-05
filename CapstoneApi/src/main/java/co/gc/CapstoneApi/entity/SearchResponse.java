package co.gc.CapstoneApi.entity;

import java.util.ArrayList;
import java.util.List;

public class SearchResponse {

	private List<Movie> Search;

	public List<Movie> getSearch() {
		return Search;
	}

	public void setSearch(List<Movie> search) {
		Search = search;
	}

	@Override
	public String toString() {
		return "SearchResponse [Search=" + Search + "]";
	}

	
	
	
}
