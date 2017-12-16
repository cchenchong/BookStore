package book.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import book.entity.BookCar;
import book.entity.User;
import book.service.BookCarServiceImpl;

@Controller
public class BookCarController {

	@Resource
	private BookCarServiceImpl bookcarServiceImpl;
	
	@RequestMapping("/findCar")
	public String find(HttpServletRequest request,Model model){
		HttpSession session = request.getSession();
		int id = (int)session.getAttribute("id");
		List<BookCar> list=this.bookcarServiceImpl.findAll(id);
		model.addAttribute("list", list);
		User user = (User)bookcarServiceImpl.findUser(id);
		model.addAttribute("User",user);
		return "ShopCar";
	}
}
