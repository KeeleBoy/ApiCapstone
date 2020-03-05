package co.gc.CapstoneApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.gc.CapstoneApi.entity.Movie;

@Controller

public class CapstoneController {

	@Autowired
	private ApiService apiServ;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/movie/{id}")
	public ModelAndView singleMovie(@PathVariable("id") String id) {
		Movie movie = apiServ.getMovie(id);
		return new ModelAndView("movie", "movie", movie);

	}

	@RequestMapping("/search-results")
	public ModelAndView searchResults(@RequestParam("search") String search) {
		List<Movie> movies = apiServ.searchMovie(search);
		// Search s = apiServ.searchMovie(search);

		return new ModelAndView("results", "movies", movies);

	}

}
