package book.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.BookCar;
import book.entity.Orders;
import book.service.OrderServiceImpl;

@Controller
public class OrderController {

	@Resource
	private OrderServiceImpl orderServiceimpl;
	
	@RequestMapping("/order")
	public String save(HttpServletRequest request,Model model,@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("tel") String tel,@RequestParam("email") String email){
		HttpSession session = request.getSession();
		int id = (int)session.getAttribute("id");
		orderServiceimpl.save(id,name,address,tel,email,"no");
		Orders orders = orderServiceimpl.find(id);
		model.addAttribute("order", orders);
		List<BookCar> list=this.orderServiceimpl.findAll(id);
		model.addAttribute("list", list);
		return "order";
	}
}
