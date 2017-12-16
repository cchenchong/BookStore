package book.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.service.AddBookServiceImpl;

@Controller
public class AddBookController {
	@Resource
	private AddBookServiceImpl addBookServiceimpl;
	@RequestMapping("/bookadd")
	public String save(@RequestParam("name") String name,@RequestParam("img") String img,@RequestParam("author") String author,@RequestParam("publisher") String publisher,@RequestParam("price") int price,@RequestParam("description") String description){
		addBookServiceimpl.save(name,img,author,publisher,price,description);
		return "admin";
	}
}
