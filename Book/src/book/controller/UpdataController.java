package book.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.BookCar;
import book.service.UpdateServiceImpl;

@Controller
public class UpdataController {

	@Resource
	private UpdateServiceImpl updateServiceimpl;
	
	@RequestMapping("/update")
	public String updateBookCar(HttpServletRequest request,@RequestParam("id") int i,Model model) {
		int count = Integer.parseInt(request.getParameter("count"));
		updateServiceimpl.update(i, count);
		List<BookCar> list=this.updateServiceimpl.findAll();
		model.addAttribute("list", list);
		return "ShopCar";
	}
}
