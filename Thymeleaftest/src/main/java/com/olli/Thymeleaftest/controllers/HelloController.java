package com.olli.Thymeleaftest.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.olli.Thymeleaftest.models.*;

@Controller
public class HelloController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(@RequestParam Map<String,String> requestParams, Model model) throws Exception {
			
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(0, "Pekka", "Maijanen", "pekka.maijanen@gmail.com"));
		studentList.add(new Student(1, "Mari", "Ahonen", "mari.ahonen@gmail.com"));
		studentList.add(new Student(2, "Matti", "Nykänen", "matti.nykanen@gmail.com"));
		
		model.addAttribute("students", studentList);
		
		return "hello";
	}
}
