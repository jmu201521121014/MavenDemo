package com.javen.MavenDemo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.javen.MavenDemo.bean.Admin;
import com.javen.MavenDemo.bean.User;
import com.javen.MavenDemo.dao.*;

@Service("userService")
public class UserServiceImpl {
	@Autowired
	private UserMapper userMapper; 
	
	public User loginForm(User bo) {
		User user = userMapper.loginForm(bo);
		return user;
	}
	/*public Admin loginForm(Admin bo)
	{
		Admin admin = adminMapper.loginForm(bo);
		return admin;
	}*/
	
	
}
