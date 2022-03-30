package trasua.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import trasua.Entity.giohang;
import trasua.Entity.hoadon;
import trasua.Entity.taikhoan;
import trasua.Service.User.HomeServiceImpl;
import trasua.Service.User.giohangServiceImpl;
import trasua.Service.User.hoadonServiceImpl;
import trasua.Service.User.sanphamServiceImpl;


@Controller
public class giohangController extends BaseController {

	@Autowired
	private giohangServiceImpl cartservice = new giohangServiceImpl();
	@Autowired
	HomeServiceImpl homeService= new HomeServiceImpl();
	@Autowired
	sanphamServiceImpl SanphamService;
	@Autowired
	hoadonServiceImpl hoadonService;

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
	
	@RequestMapping(value = "checkout", method = RequestMethod.GET)
	public ModelAndView Checkout(HttpServletRequest request ,HttpSession session) {
		_mvShare.setViewName ("user/checkout");
	    hoadon hoadon = new hoadon();
	    taikhoan loginInfo = (taikhoan)session.getAttribute("LoginInfo");
	    if(loginInfo != null) {
	        hoadon.setDiaChi(loginInfo.getDiaChi());
	        hoadon.setTenNguoiMua(loginInfo.getTenNguoiDung());
	        hoadon.setSdt(loginInfo.getSdt());
	        
	    }
	    _mvShare.addObject("hoadon", hoadon);
	    return _mvShare;
}
	    
	    @RequestMapping(value = "checkout", method = RequestMethod.POST)
	    public String CheckoutBill(HttpServletRequest request ,HttpSession session, @ModelAttribute("hoadon") hoadon bill) {
	        bill.setQuanty(Integer.parseInt((String) session.getAttribute("TotalPriceCart")));
	       bill.setTotal(Double.parseDouble( (String) session.getAttribute("TotalQuantyCart")));
	        if(hoadonService.addhoadon(bill) > 0) {
	            HashMap<Long, giohang> cart = (HashMap<Long, giohang>)session.getAttribute("giohang");
	           hoadonService.addcthd(cart);
	        
	        }
	        session.removeAttribute("giohang");
	        return "redirect:cart";
}
	    }