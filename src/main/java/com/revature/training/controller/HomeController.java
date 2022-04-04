package com.revature.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/sayHello")
	public ModelAndView sayHello() {
		ModelAndView view = new ModelAndView();
		view.setViewName("hello");
		return view;
	}
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		return view;
	}
	
	@RequestMapping("/break")
	public ModelAndView breakPage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("breakPage");
		return view;
	}
}


//localhost:9092