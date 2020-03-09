package co.gc.CapstoneApi;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.gc.CapstoneApi.dao.UserDao;
import co.gc.CapstoneApi.entity.User;

@Controller

public class LoginController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private HttpSession sesh;
	
	

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login-form");

	}

	@PostMapping("/login")
	public ModelAndView loginSubmit(@RequestParam("name") String name, @RequestParam("password") String password,
			RedirectAttributes redir) {

		User user = userDao.findByNameIgnoreCase(name);

		if (user == null || !password.equals(user.getPassword())) {
			ModelAndView mav = new ModelAndView("login-form");
			mav.addObject("message", "Wrong user name or password loser");
			return mav;
		}

		sesh.setAttribute("user", user);

		redir.addFlashAttribute("message", "Logged you in " + user.getName());

		return new ModelAndView("redirect:/viewlist");

	}

	@RequestMapping("/logout")
	public ModelAndView logout(RedirectAttributes redir) {

		sesh.invalidate();

		redir.addFlashAttribute("message", "logged you out :/");
		return new ModelAndView("redirect:/login");

	}

	@RequestMapping("/user-add")
	public ModelAndView addTrainer() {
		return new ModelAndView("user-add");
	}

	@PostMapping("/user-add")
	public ModelAndView AddTrainer(User user) {
		userDao.save(user);
		return new ModelAndView("redirect:/");
	}

}
