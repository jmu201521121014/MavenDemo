package com.javen.MavenDemo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.javen.MavenDemo.bean.User;
import com.javen.MavenDemo.utils.ServerResponse;
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
	public Object loginForm(User bo,HttpSession session) throws Exception {
		ServerResponse result = new ServerResponse();
		User user = userService.loginForm(bo);
		if(user != null)                            //��������û�
		{
			result.setSuccess(true);
			session.setAttribute("user", user);
		}
		else
			result.setSuccess(false);
		return result;
	}
	
	
}
