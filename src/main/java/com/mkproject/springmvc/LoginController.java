package com.mkproject.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping(value="/login",  method = RequestMethod.GET	)
	public String sayHello() {
		return "login";
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String authenUserPW()
	{
		//String username =
		System.out.println("handle post");
		return "welcome";
	}
}
