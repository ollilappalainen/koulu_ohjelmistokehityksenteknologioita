package com.olli.Thymeleaftest.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.olli.Thymeleaftest.models.*;

@Controller
public class HelloController {
	ArrayList<Student> studentList;
	public HelloController() {
		studentList = new ArrayList<Student>();
		studentList.add(new Student(0, "Pekka", "Maijanen", "pekka.maijanen@gmail.com"));
		studentList.add(new Student(1, "Mari", "Ahonen", "mari.ahonen@gmail.com"));
		studentList.add(new Student(2, "Matti", "Nykänen", "matti.nykanen@gmail.com"));
	}
	
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public String student(Model model) throws Exception {		
		model.addAttribute("student", new Student());
		model.addAttribute("students", studentList);		
		return "students";
	}
	
	@RequestMapping(value="/addstudents", method=RequestMethod.POST)
	public String addStudent(@ModelAttribute Student student, Model model) {
		studentList.add(student);
		System.out.println(studentList.size());
		
		model.addAttribute("students", studentList);
		return "redirect:/students";
	} 
}

