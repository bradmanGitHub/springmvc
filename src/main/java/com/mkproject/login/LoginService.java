package com.mkproject.login;

import org.springframework.stereotype.Service;

//new LoginService()
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("batman") &&
				password.equalsIgnoreCase("1234");
	}
}