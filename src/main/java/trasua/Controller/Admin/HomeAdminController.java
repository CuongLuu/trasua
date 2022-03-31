package trasua.Controller.Admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import trasua.Entity.taikhoan;
import trasua.Entity.sanpham;
import trasua.Service.Admin.AccServiceImpl;
import trasua.Service.Admin.HomeAdminServiceImpl;
import trasua.Service.User.AccountServiceImpl;
import trasua.Service.User.HomeServiceImpl;

@Controller
public class HomeAdminController extends BaseAdminController {

	@Autowired
	HomeServiceImpl homeService= new HomeServiceImpl();
	@Autowired
	HomeAdminServiceImpl homeadminService= new HomeAdminServiceImpl();
	@Autowired
	AccServiceImpl accService= new AccServiceImpl();
	
	@RequestMapping(value = {"/admin/hompage"})
	public ModelAndView Index(HttpSession session) {
		if(session.getAttribute("LoginInforAdmin")!=null)
		{
			_mvaShare.setViewName("admin/index");
		}
		else {
			_mvaShare.addObject("user", new taikhoan());
			_mvaShare.setViewName("admin/LoginAdmin");
		}
		return _mvaShare;
	}
	
	@RequestMapping(value = {"/admin/sanpham"})
	public ModelAndView sanpham() {
		ModelAndView mv = new ModelAndView("admin/ProductAdmin");
		mv.addObject("sanpham", homeService.GetDataSlide());
		return mv;
	}
	
	@RequestMapping(value = {"/admin/loaisanpham"})
	public ModelAndView loaisanpham() {
		ModelAndView mv = new ModelAndView("admin/CategoryAdmin");
		mv.addObject("loaisanpham", homeService.GetDataloaiSP());
		return mv;
	}
	
	@RequestMapping(value = {"/admin/themsanpham"})
	public ModelAndView trangthemsanpham() {
		ModelAndView mv = new ModelAndView("admin/CreateProduct");
		mv.addObject("sanpham", new sanpham());
		
		return mv;
	}
	@RequestMapping(value = "admin/themsanpham", method = RequestMethod.POST)
	public ModelAndView themsanpham(HttpSession session,@ModelAttribute("sanpham") sanpham sanpham) throws Exception{
		int count = homeadminService.insert(sanpham);
		if (count != 0) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("Status", "Thêm sản phẩm  thành công");
			mv.setViewName("admin/CreateProduct");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("Status", "Thếm sản phẩm không thành công");
			mv.setViewName("admin/CreateProduct");
			return mv;
		}	
		
	}
	
}
