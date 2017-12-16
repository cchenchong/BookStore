package book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import book.entity.Book;
import book.service.FindBookServiceImpl;

@Controller
public class FindBookController {

	@Resource
	private FindBookServiceImpl findBookServiceimpl;
	@RequestMapping("/findbook")
	public String findUser(Model model) {
		List<Book> book=this.findBookServiceimpl.listAll();
		model.addAttribute("book", book);
		return "admin";
	}
}
