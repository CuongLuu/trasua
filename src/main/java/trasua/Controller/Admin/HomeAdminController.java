package trasua.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeAdminController {
	
	
	@RequestMapping(value = {"/admin/donhang"})
	public ModelAndView donhang() {
		ModelAndView mv = new ModelAndView("admin/donhang");
		return mv;
	}
}
