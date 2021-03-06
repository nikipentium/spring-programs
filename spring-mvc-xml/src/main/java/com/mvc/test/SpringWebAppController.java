package com.mvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringWebAppController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello(Model model){
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
}
