package com.codingdojo.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.mvc.model.Dojo;
import com.codingdojo.mvc.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	private final DojoService dojoService;

	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}

	@GetMapping("/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "index.jsp";
	}
	
}
