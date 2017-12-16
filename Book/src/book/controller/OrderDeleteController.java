package book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.Orders;
import book.service.OrderDeleteServiceImpl;

@Controller
public class OrderDeleteController {

	@Resource
	private OrderDeleteServiceImpl orderdeleteServiceimpl;
	
	@RequestMapping("/order_delete")
	public String delete(@RequestParam("id") int i,Model model) {
		orderdeleteServiceimpl.delete(i);
		List<Orders> orders = orderdeleteServiceimpl.find();
		model.addAttribute("orders",orders);
		return "admin";
	}
}
