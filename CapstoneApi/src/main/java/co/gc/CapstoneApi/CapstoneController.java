package co.gc.CapstoneApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.gc.CapstoneApi.dao.MovieDao;

@Controller

public class CapstoneController {

	@Autowired
	MovieDao movieDao;

	@Autowired
	private ApiService apiServ;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/movie")
	public ModelAndView singleMovie(@RequestParam String title) {
		return new ModelAndView("movie");

	}

	@RequestMapping("/search-results")
	public ModelAndView searchResults(@RequestParam String search) {
		ModelAndView mav = new ModelAndView("search-results");
		// mav.addObject("search", apiServ);
		return mav;

	}

}
