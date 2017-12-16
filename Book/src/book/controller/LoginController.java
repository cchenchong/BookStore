package book.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import book.entity.User;
import book.service.LoginServiceImpl;

@Controller

public class LoginController {
	@Resource
	private LoginServiceImpl loginServiceImpl;
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model) {
		String name = request.getParameter("logname");
		String pwd = request.getParameter("logpass");
		List<User> list=this.loginServiceImpl.listAll();
		for(int i =0;i<list.size();i++) {
		if(name.equals( list.get(i).getName())&& pwd.equals(list.get(i).getPassword()))  {
			HttpSession session = request.getSession();
			session.setAttribute("id",list.get(i).getId());
			return "Shop";
		}
	}
		return "regist";
	}
}
