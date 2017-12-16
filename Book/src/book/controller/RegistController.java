package book.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import book.service.RegistServiceImpl;

@Controller
public class RegistController {

	@Resource
	private RegistServiceImpl registServiceImpl;
	
	@RequestMapping("/regist")
	public String list(HttpServletRequest request,@RequestParam("id") int i,@RequestParam("userName") String name,@RequestParam("userPwd") String psw,@RequestParam("email") String e,@RequestParam("tel") String t,@RequestParam("address") String a){
		System.out.println(name + psw);
		this.registServiceImpl.regist(i,name,psw,e,t,a);
		return "login";
	}


}
