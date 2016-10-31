package com.springapp.Controller;

import com.springapp.dao.StudentDao;
import com.springapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private StudentDao stdDao;

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

		Student st = new Student();
		st.setName(name);
		st.setRoll(roll);
		st.setAddress(address);




		return model;
	}
}