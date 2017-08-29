package com.olli.Thymeleaftest.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.olli.Thymeleaftest.models.*;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(@RequestParam Map<String,String> requestParams, Model model) throws Exception {
		String age = requestParams.get("age");
		String name = requestParams.get("name");
		model.addAttribute("age", age);
		model.addAttribute("name", name);
		return "hello";
	}
	
	@RequestMapping(value = "messages")
	public String messages(Model model) {
		String[] lista;
		lista[1] = "Olli Lappalainen";
		lista[2] = "Pekka Laakso";
		lista[3] = "Kalle Koilo";
		Student minna = new Student();
		minna.setFirstName("Minna");
		minna.setLastName("Pahka");
		
		model.addAttribute("messages", lista[]);
	}
}
