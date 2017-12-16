package book.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.entity.User;
import book.service.UserDeleteServiceImpl;

@Controller
public class UserDeleteController {

	@Resource
	private UserDeleteServiceImpl userDeleteServiceimpl;
	
	@RequestMapping("/user_delete")
	public String delete(@RequestParam("id") int i,Model model) {
		userDeleteServiceimpl.delete(i);
		List<User> list=this.userDeleteServiceimpl.findAll();
		model.addAttribute("list", list);
		return "admin";
	}
}
