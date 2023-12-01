package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.TCS.entity.User;
import com.TCS.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping("showRegisterPage")
	public String showRegisterPage() {
		return "register";
	}

	@RequestMapping("login")
	public ModelAndView login(User user, HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();

		if (user.getUsername().equals("admin") && user.getPassword().equals("admin123")) {
			modelAndView.setViewName("questionsmanagement");
		} else if (service.validate(user)) {
			modelAndView.setViewName("questions");
			modelAndView.addObject("message", "welcome " + user.getUsername());
			HttpSession ses = request.getSession();
			ses.setAttribute("username", user.getUsername());
		} else {
			modelAndView.setViewName("login");
			modelAndView.addObject("errorMessage", "wrong credentials");
		}
		return modelAndView;
	}

}
