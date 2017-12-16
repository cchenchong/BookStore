package book.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.Book;
import book.entity.Page;
import book.service.SearchServiceImpl;

@Controller
public class SearchController {
	@Resource
	private SearchServiceImpl searchServiceimpl;
	@RequestMapping("/search1")
	public String search(HttpServletRequest request,Model model,@RequestParam("name") String name) {
		List<Book> book = searchServiceimpl.findByname(name);
		  String pageNo = request.getParameter("pageNo");
	        if (pageNo == null) {
	            pageNo = "1";
	        }
	        Page page = searchServiceimpl.queryForPage(Integer.valueOf(pageNo), 4,name);
	        request.setAttribute("page", page);
		model.addAttribute("book", book);
		model.addAttribute("name", name);
		model.addAttribute("method","search1");
		return "Shop";
	}
}
