package com.mkproject.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	//Set the login Service - Auto wire
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login",  method = RequestMethod.GET	)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login",  method = RequestMethod.POST	)
	public String handleLoginPost(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(!service.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}
