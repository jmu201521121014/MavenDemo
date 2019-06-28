package com.javen.MavenDemo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javen.MavenDemo.bean.User;
import com.javen.MavenDemo.bean.Admin; 
import com.javen.MavenDemo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method = {RequestMethod.POST,RequestMethod.GET})
	public String login(){

		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/loginForm",method = {RequestMethod.POST,RequestMethod.GET})
	public String loginForm(User bo,HttpSession session) throws Exception {
		
		//ServerResponse result = new ServerResponse();
		//Admin admin = loginService.loginForm(new Admin(username,password));
		User user = userService.loginForm(bo);
		if(user != null){
			session.setAttribute("user", user);
			return "true";
		}
		else{
			return "false";
		}
		 
		/*User user = userService.loginForm(bo);
	
		if(user != null)                            //��������û�
		{
			result.setSuccess(true);
			session.setAttribute("user", user);
		}
		else
			result.setSuccess(false);
		return result;*/  
	}
	
	
}
