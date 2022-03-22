package trasua.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import trasua.Entity.giohang;
import trasua.Service.User.HomeServiceImpl;
import trasua.Service.User.giohangServiceImpl;
import trasua.Service.User.sanphamServiceImpl;


@Controller
public class giohangController extends BaseController {

	@Autowired
	private giohangServiceImpl cartservice = new giohangServiceImpl();
	@Autowired
	HomeServiceImpl homeService= new HomeServiceImpl();
	@Autowired
	sanphamServiceImpl SanphamService;

	@RequestMapping(value = "/cart")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/cart");
		mv.addObject("sanpham", homeService.GetDataSlide());
		mv.addObject("loaisanpham", homeService.GetDataloaiSP());
		return mv;
	}
	@RequestMapping(value = "addCart/{id}")
	public String addCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		_mvShare.addObject("sanpham", homeService.GetDataSlide());
		_mvShare.addObject("sanpham", SanphamService.GetProductByID(id));
	   HashMap<Long, giohang> cart = (HashMap<Long, giohang>)session.getAttribute("giohang");
	    if(cart == null) {
	        cart = new HashMap<Long, giohang>();
	   
	    }
	    cart = cartservice.addCart(id, cart);
	    session.setAttribute("giohang", cart);
	    session.setAttribute("TotalQuantyCart", cartservice.TotalQuanty(cart));
	    session.setAttribute("TotalPriceCart", cartservice.TotalPrice(cart));
	   return "redirect:"+ request.getHeader("Referer");
	}
	@RequestMapping(value = "editCart/{id}/{quanty}")
	public String editCart(HttpServletRequest request, HttpSession session, @PathVariable long id,@PathVariable long quanty) {
		_mvShare.addObject("sanpham", homeService.GetDataSlide());
		_mvShare.addObject("sanpham", SanphamService.GetProductByID(id));
	   HashMap<Long, giohang> cart = (HashMap<Long, giohang>)session.getAttribute("giohang");
	    if(cart == null) {
	        cart = new HashMap<Long, giohang>();
	   
	    }
	    cart = cartservice.editCart(id , quanty, cart);
	    session.setAttribute("giohang", cart);
	    session.setAttribute("TotalQuantyCart", cartservice.TotalQuanty(cart));
	    session.setAttribute("TotalPriceCart", cartservice.TotalPrice(cart));
	   return "redirect:"+ request.getHeader("Referer");
	}
	@RequestMapping(value = "deleteCart/{id}")
	public String deleteCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		_mvShare.addObject("sanpham", homeService.GetDataSlide());
		_mvShare.addObject("sanpham", SanphamService.GetProductByID(id));
	   HashMap<Long, giohang> cart = (HashMap<Long, giohang>)session.getAttribute("giohang");
	    if(cart == null) {
	        cart = new HashMap<Long, giohang>();
	   
	    }
	    cart = cartservice.deleteCart(id, cart);
	    session.setAttribute("giohang", cart);
	    session.setAttribute("TotalQuantyCart", cartservice.TotalQuanty(cart));
	    session.setAttribute("TotalPriceCart", cartservice.TotalPrice(cart));
	   return "redirect:"+ request.getHeader("Referer");
	}
}
