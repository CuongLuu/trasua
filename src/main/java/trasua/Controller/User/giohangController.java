package trasua.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import trasua.Entity.giohang;
import trasua.Service.User.HomeServiceImpl;
import trasua.Service.User.giohangServiceImpl;


@Controller
public class giohangController extends BaseController {

	@Autowired
	private giohangServiceImpl cartservice = new giohangServiceImpl();
	@Autowired
	HomeServiceImpl homeService= new HomeServiceImpl();

	@RequestMapping(value = "addCart/{id}")

	public String addCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		_mvShare.addObject("sanpham", homeService.GetDataSlide());
	   HashMap<Long, giohang> cart = (HashMap<Long, giohang>)session.getAttribute("giohang");
	    if(cart == null) {
	        cart = new HashMap<Long, giohang>();
	   
	    }
	    cart = cartservice.addCart(id, cart);
	    session.setAttribute("giohang", cart);
	    return "redirect:/productDetail/" +id;
	   // return "redirect:"+ request.getHeader("Referer");
	}
}