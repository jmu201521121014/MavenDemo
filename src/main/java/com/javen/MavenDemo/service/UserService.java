package com.javen.MavenDemo.service;

import com.javen.MavenDemo.bean.User; 

public interface UserService {
	/**
	 * 用户进行登陆的Service
	 * @param bo
	 * @return
	 */
	
	public User loginForm(User bo);
}
