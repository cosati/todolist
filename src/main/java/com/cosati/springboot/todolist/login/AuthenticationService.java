package com.cosati.springboot.todolist.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("cosati");
		boolean isValidPassword = password.equals("pass");
		
		return isValidUsername && isValidPassword;
	}
	
}
