package book.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import book.entity.Page;
import book.service.PageServiceImpl;

@Controller
public class PageController {
	
	@Resource
	private PageServiceImpl PageServiceImpl;
	
	@RequestMapping("/message.action")
	public String findAll(HttpServletRequest request,Model model,String name) {
        String pageNo = request.getParameter("pageNo");
        if (pageNo == null) {
            pageNo = "1";
        }
        Page page = PageServiceImpl.queryForPage(Integer.valueOf(pageNo), 4);
        request.setAttribute("page", page);
        model.addAttribute("method","message.action");
        return "Shop";
	}
}
