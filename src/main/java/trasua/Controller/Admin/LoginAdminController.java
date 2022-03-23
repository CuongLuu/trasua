package trasua.Controller.Admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import trasua.Entity.taikhoan;
import trasua.Service.User.AccountServiceImpl;

@Controller
public class LoginAdminController extends BaseAdminController {
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView viewLoginAdmin() {
		_mvaShare.setViewName("admin/LoginAdmin");
		_mvaShare.addObject("user", new taikhoan());
		return _mvaShare;
		
	}

	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public ModelAndView LoginAdmin(HttpSession session, @ModelAttribute("user") taikhoan user) {
		user = accountService.CheckAccountAdmin(user);
		if (user != null) {
			_mvaShare.setViewName("redirect:/admin/index");
			_mvaShare.addObject("StatusloginAdmin", "Đăng nhập thành công!");
			session.setAttribute("LoginInforAdmin", user);
		} else if(user == null) {
			_mvaShare.addObject("StatusloginAdmin", "Đăng nhập không thành công!");
			_mvaShare.setViewName("redirect:/admin/LoginAdmin");
			
		}

		return _mvaShare;
	}
}
