package trasua.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginAdminController {
	@RequestMapping(value = {"/loginadmin"})
	public ModelAndView Menu() {
		ModelAndView mv = new ModelAndView("admin/LoginAdmin");
		return mv;
	}
}
