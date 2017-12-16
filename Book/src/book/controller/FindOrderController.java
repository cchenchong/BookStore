package book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import book.entity.Orders;
import book.service.FindOrderServiceImpl;

@Controller
public class FindOrderController {

	@Resource
	private FindOrderServiceImpl findorderServiceimpl;
	@RequestMapping("/findorder")
	public String find(Model model) {
		List<Orders> orders = this.findorderServiceimpl.findAll();
		model.addAttribute("orders", orders);
		return "admin";
	}
}
