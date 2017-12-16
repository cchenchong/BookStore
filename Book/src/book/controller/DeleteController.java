package book.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.BookCar;
import book.service.DeleteServiceImpl;

@Controller
public class DeleteController {

	@Resource
	private DeleteServiceImpl deleteServiceimpl;
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,@RequestParam("id") int i,Model model) {
		deleteServiceimpl.delete(i);
		List<BookCar> list=this.deleteServiceimpl.findAll();
		model.addAttribute("list", list);
		return "ShopCar";
	}
}
