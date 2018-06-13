package com.nikhil.webfragment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@Controller
public class App 
{
	@RequestMapping("/plugged")
  public String plugged()
  {
	  return "plugged";
  }
}
