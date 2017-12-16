package book.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.service.ShopCarServiceImpl;

@Controller
public class ShopCarController {
	
	@Resource
	private ShopCarServiceImpl shopCarserviceImpl;
	
	@RequestMapping("/car")
	public String car(HttpServletRequest request,@RequestParam("price") int p,@RequestParam("img") String i,@RequestParam("count") int c) {
		HttpSession session = request.getSession();
		int user_id = (int)session.getAttribute("id");
		shopCarserviceImpl.saveCar(p, i,c,user_id);
		return "Shop";
	}
}
