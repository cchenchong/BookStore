package book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import book.entity.User;
import book.service.FindUserServiceImpl;

@Controller
public class FindUserController {
	
	@Resource
	private FindUserServiceImpl finduserServiceimpl;
	@RequestMapping("/finduser")
	public String findUser(Model model) {
		List<User> list=this.finduserServiceimpl.listAll();
		model.addAttribute("list", list);
		return "admin";
	}
}
