package book.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.Book;
import book.service.BookUpdateServiceImpl;

@Controller
public class BookUpdateController {
	@Resource
	private BookUpdateServiceImpl bookUpdateServiceimpl;
	@RequestMapping("/bookupdate")
	public String updateBook(HttpServletRequest request,@RequestParam("id") int i,Model model) {
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");
		bookUpdateServiceimpl.update(i, name,author,publisher,price,description);
		Book book = bookUpdateServiceimpl.find(i);
		model.addAttribute("book", book);
		return "bookupdate";
	}
}
