package com.ravi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ravi.binding.Student;
import com.ravi.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		

		formInitBinding(model);
		/*
		 * instead of writing same code in two method put that code in one method 
		 *  select the peace of code right click reflector extract method 
		*/
		//model.addAttribute("student", new Student());
		//model.addAttribute("courses", service.getCourses());
		//model.addAttribute("timings", service.getTiming());
		return "index";
	}

	private void formInitBinding(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings", service.getTiming());
	}

	@PostMapping("/save")
	public String handelSubmitButton(Student s,Model model) {
		System.out.println(s);
		boolean isSave = service.saveStudent(s);
		if(isSave) {
		model.addAttribute("msg", "Data save.....");
		}
		formInitBinding(model);
		/*
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings", service.getTiming());
		*/
		return "index";
	}
}
