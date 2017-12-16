package book.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.Book;
import book.service.BookServiceImpl;

@Controller
public class BookController {
	@Resource
	private BookServiceImpl bookServiceImpl;
	@RequestMapping("/book1")
	public String find(Model model,@RequestParam("id") int i) {
		Book book = bookServiceImpl.find(i);
		model.addAttribute("book", book);
		return "bookupdate";
	}
}
