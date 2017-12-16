package book.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.Book;
import book.service.DetailServiceImpl;

@Controller
public class ShopListController {
	
	@Resource
	private DetailServiceImpl detailserviceimpl;
	
	@RequestMapping("/details")
	public String detial(HttpServletRequest request,@RequestParam("id") int i) {
		Book b = detailserviceimpl.findById(i);
		request.setAttribute("book", b);
		return "ShopDetails";
	}
}
