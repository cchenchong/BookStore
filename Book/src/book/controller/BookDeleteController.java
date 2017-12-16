package book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.Book;
import book.service.BookDeleteServiceImpl;

@Controller
public class BookDeleteController {
	@Resource
	private BookDeleteServiceImpl bookDeleteServiceimpl;
	@RequestMapping("/book_delete")
	public String deleteBook(@RequestParam("id") int i,Model model) {
		bookDeleteServiceimpl.delete(i);
		List<Book> book = bookDeleteServiceimpl.findAll();
		model.addAttribute("book", book);
		return "admin";
	}
}
