package com.sagar.spring.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sagar.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	@RequestMapping("/displayEmployee")
	public ModelAndView displayList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Sagar");
		employee1.setSalary(10000);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Suman");
		employee2.setSalary(99000);

		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Arush");
		employee3.setSalary(80000);

		Employee employee4 = new Employee();
		employee4.setId(4);
		employee4.setName("Anish");
		employee4.setSalary(89000);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}
