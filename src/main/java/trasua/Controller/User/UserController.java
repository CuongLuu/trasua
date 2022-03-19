package trasua.Controller.User;

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
public class UserController extends BaseController {
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView Register() {
		_mvShare.setViewName("user/Register");
		_mvShare.addObject("user", new taikhoan());
		
		return _mvShare;
	}
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView CreateAccount(HttpSession session,@ModelAttribute("user") taikhoan user) throws Exception{
		int count = accountService.AddAccount(user);
		if (count != 0) {
			_mvShare.addObject("Status", "Đăng ký tài khoản thành công");
			_mvShare.setViewName("user/index");
			session.setAttribute("LoginInfor", user);
		} else {
			_mvShare.addObject("Status", "Đăng ký tài khoản không thành công");
			_mvShare.setViewName("user/Register");
		}	
		
		return _mvShare;
	}
}
