package co.gc.CapstoneApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.CapstoneApi.dao.MovieDao;

@Controller

public class CapstoneController {

	@Autowired
	MovieDao movieDao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

}
