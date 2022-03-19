package trasua.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import trasua.Service.User.HomeServiceImpl;

@Controller
@Service
public class HomeController {
	@Autowired
	HomeServiceImpl homeService= new HomeServiceImpl();
	
	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("sanpham", homeService.GetDataSlide());
		
		
		return mv;
	}
	@RequestMapping(value = {"/menu" })
	public ModelAndView Menu() {
		ModelAndView mv = new ModelAndView("user/menu");
		mv.addObject("sanpham", homeService.GetDataSlide());
		mv.addObject("loaisanpham", homeService.GetDataloaiSP());
		return mv;
	}
	@RequestMapping(value = {"/ProductDetail" })
	public ModelAndView Detail() {
		ModelAndView mv = new ModelAndView("user/ProductDetail");
		return mv;
	}


}
