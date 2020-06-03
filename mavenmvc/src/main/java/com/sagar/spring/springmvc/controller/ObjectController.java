package com.sagar.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sagar.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	@RequestMapping("readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("Sagar");
		employee.setSalary(10000);
		modelAndView.addObject("emp", employee);
		return modelAndView;

	}
}
