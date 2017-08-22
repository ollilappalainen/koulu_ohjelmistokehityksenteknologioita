package com.ollilappalainen.week1ex1.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {
	
	public String mainPage() {
		return "This is the main page.";
	}
	@RequestMapping("/index")
	public String hello(@RequestParam Map<String,String> requestParams) throws Exception {
		String location = requestParams.get("location");
		String name = requestParams.get("name");
		return "Hello to the " + location + ", " + name;
	}
	@RequestMapping("/contact")
	public String contactPage() {
		return "This is the contact page.";
	}
}
