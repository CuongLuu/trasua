package trasua.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		return mv;
	}
	@RequestMapping(value = {"/menu" })
	public ModelAndView Menu() {
		ModelAndView mv = new ModelAndView("user/menu");
		return mv;
	}
	@RequestMapping(value = {"/ProductDetail" })
	public ModelAndView Detail() {
		ModelAndView mv = new ModelAndView("user/ProductDetail");
		return mv;
	}


}
