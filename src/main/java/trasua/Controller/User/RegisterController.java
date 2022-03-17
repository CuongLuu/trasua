package trasua.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping(value = {"/register"})
	public ModelAndView Menu() {
		ModelAndView mv = new ModelAndView("user/Register");
		return mv;
	}
}
