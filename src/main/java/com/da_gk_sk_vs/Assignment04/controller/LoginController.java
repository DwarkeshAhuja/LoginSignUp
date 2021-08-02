package com.da_gk_sk_vs.Assignment04.controller;
/*
 *  Author: Dwarkesh Ahuja Gurleen Kaur Sukhmeet Kaur Virender Singh
 *  Date: July 16th 2021 
 *  Desc : this is the login controller which will all the navigation requests from the login page
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.da_gk_sk_vs.Assignment04.bean.Login;
import com.da_gk_sk_vs.Assignment04.bean.Userclass;
import com.da_gk_sk_vs.Assignment04.service.UserService;

@Controller  // Controller Annotation used to predefine the controller of login page
public class LoginController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String showLogin(Model m) {
	  // Model of login class is set to the login page
	  m.addAttribute("command", new Login());
	  // Login.jsp page is rendered 
	  return "login";
  }

  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") Login login) {
	  // When login details are entered and login button is pressed 
	  ModelAndView mav = null;
	  System.out.println(login.getuName());
	  System.out.println(login.getuPass());
	  // Console logs are made to get the login details 
	  Userclass user = userService.validateUser(login);
	  // user service is called to get the verification that user is registered or not. 
	  if (null != user) {
		  // is user is registered 
		  mav = new ModelAndView();
		  mav.setViewName("welcome");
		  mav.addObject("firstname", user.getFirstName());
	  } else {
		  // is user is not registered then model is again set to login and new message object 
		  // is added
		  mav = new ModelAndView();
		  mav.setViewName("login");
		  mav.addObject("message", "Username or Password is wrong!!");
	  }
	  return mav;
  }
}
