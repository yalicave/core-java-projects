package com.venkat.tech.management.app.service;

import com.venkat.tech.management.app.domain.User;
import com.venkat.tech.management.app.filesystem.UserFileRepository;
import com.venkat.tech.management.app.filesystem.UserRepository;

public class UserService {
	UserRepository ur = null;
	
	public UserService() {
	ur = new UserFileRepository();
	
	}
public void save(User user) {
		System.out.println(user);
	}
public void findAll() {
	ur.findAll();
}
}
