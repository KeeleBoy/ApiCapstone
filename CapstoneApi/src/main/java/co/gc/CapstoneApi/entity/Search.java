package co.gc.CapstoneApi.entity;

import java.util.List;

public class Search {

	private List<Movie> movies;

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Search [movies=" + movies + "]";
	}

	public Search() {
	}

}
