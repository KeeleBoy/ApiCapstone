package co.gc.CapstoneApi.entity;

import java.util.List;

public class Search {

	private List<Movie> search;

	public List<Movie> getSearch() {
		return search;
	}

	public void setSearch(List<Movie> movies) {
		this.search = movies;
	}

	@Override
	public String toString() {
		return "Search [movies=" + search + "]";
	}

	public Search() {
	}

}
