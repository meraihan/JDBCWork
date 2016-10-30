package com.springapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "doSubmit", method = RequestMethod.POST)
	public ModelAndView doSubmit(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("view");

		String name = request.getParameter("names");
		String roll = request.getParameter("roll");
		String address = request.getParameter("address");




		return model;
	}
}