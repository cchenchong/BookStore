package book.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import book.entity.Admin;
import book.service.AdminLoginServiceImpl;

@Controller
public class AdminLoginController {

	@Resource
	private AdminLoginServiceImpl adminloginServiceimpl;
	
	@RequestMapping("/admin_login")
	public String login(HttpServletRequest request,Model model) {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		List<Admin> list=this.adminloginServiceimpl.listAll();
		for(int i =0;i<list.size();i++) {
			if(user.equals( list.get(i).getName())&& password.equals(list.get(i).getPassword()))  {
				return "admin";
			}
		}
		return "admin_login";
	}
}
