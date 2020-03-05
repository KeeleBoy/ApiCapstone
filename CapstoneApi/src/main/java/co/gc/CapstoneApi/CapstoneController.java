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
	public ModelAndView searchResults(@RequestParam("search") String search,
			@RequestParam(value = "type", required = false) String type,
			@RequestParam(value = "year", required = false) String year) {

		List<Movie> movies;
		if ((type == null || type.isEmpty()) && (year == null || year.isEmpty())) {
			movies = apiServ.searchMovie(search);
		} else if (type == null || type.isEmpty()) {
			movies = apiServ.searchYear(search, year);
		} else if ((year == null || year.isEmpty())) {
			movies = apiServ.searchType(search, type);
		} else {
			movies = apiServ.searchAll(search, year, type);
		}
		
		if(movies==null||movies.isEmpty()) {
			String result="No Results Found";
			return new ModelAndView("results","result", result);
		}

		return new ModelAndView("results", "movies", movies);

	}

	@RequestMapping("/search-year")
	public ModelAndView searchYear(@RequestParam("search") String search, @RequestParam("year") String year) {
		List<Movie> movies = apiServ.searchYear(search, year);
		// Search s = apiServ.searchMovie(search);

		return new ModelAndView("results", "movies", movies);

	}

}
