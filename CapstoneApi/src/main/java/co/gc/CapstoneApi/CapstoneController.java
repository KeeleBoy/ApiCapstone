package co.gc.CapstoneApi;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.gc.CapstoneApi.dao.MovieDao;
import co.gc.CapstoneApi.dao.UserDao;
import co.gc.CapstoneApi.entity.Movie;
import co.gc.CapstoneApi.entity.User;

@Controller

public class CapstoneController {

	@Autowired
	private HttpSession sesh;

	@Autowired
	private ApiService apiServ;

	@Autowired
	private MovieDao movieDao;

	@Autowired
	private UserDao userDao;

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
	public ModelAndView searchResults(@SessionAttribute(name = "user", required = false) User user,
			@RequestParam("search") String search, @RequestParam(value = "type", required = false) String type,
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

		if (movies == null || movies.isEmpty()) {
			String result = "No Results Found";
			return new ModelAndView("results", "result", result);
		}

		return new ModelAndView("results", "movies", movies);

	}

	@RequestMapping("/search-year")
	public ModelAndView searchYear(@RequestParam("search") String search, @RequestParam("year") String year) {
		List<Movie> movies = apiServ.searchYear(search, year);
		// Search s = apiServ.searchMovie(search);

		return new ModelAndView("results", "movies", movies);

	}

	@GetMapping("/movies")
	public ModelAndView createUserList(
			// @SessionAttribute(name="user", required=false) User user ,
			@RequestParam("id") String id 
		//	@RequestParam("user") String userId
			) {

		Movie movie = movieDao.findByImdbID(id);
		// To do: fix method: check if movie in list
		User user = (User) sesh.getAttribute("user");

		user = userDao.findById(user.getId()).orElse(null);

		System.out.println(user.getId());
		System.out.println(id);
		
		if (movie == null) {
			Movie newmovie = apiServ.getMovie(id);
			System.out.println(user.getId());
			newmovie.addUser(user);
			//newmovie.getUsers().add(user);
			System.out.println(user);
			//user.setMovies(user.getMovies());
			movieDao.save(newmovie);
		} 
		
		else if (!movie.getUsers().contains(user)) {
			movie.getUsers().add(user);
			movieDao.save(movie);
		}

		

		List<Movie> movieList = movieDao.findByUsers(user);
		ModelAndView mav = new ModelAndView("view-list");
		mav.addObject("view", movieList);

		return mav;

	}

	@RequestMapping("/favorite")
	public ModelAndView favoriteMovie(@RequestParam("id") String id) {
		Movie movie = movieDao.findByImdbID(id);
		movie.setFavorite(!movie.getFavorite());
		movieDao.save(movie);
		return new ModelAndView("redirect:/viewlist");
	}

	@RequestMapping("/delete")
	public ModelAndView deleteMovie(@RequestParam("id") String id) {
		Movie movie = movieDao.findByImdbID(id);
		System.out.println(movie.toString());
		movieDao.delete(movie);
		return new ModelAndView("redirect:/viewlist");

	}

	@RequestMapping("/viewlist")
	public ModelAndView viewList() {
		List<Movie> movies = movieDao.findAll();
		return new ModelAndView("view-list", "view", movies);
	}

}
