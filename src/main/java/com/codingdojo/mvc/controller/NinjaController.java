package com.codingdojo.mvc.controller;


import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.mvc.model.Ninja;
import com.codingdojo.mvc.services.DojoService;
import com.codingdojo.mvc.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	private final NinjaService ninjaService;


	public NinjaController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
	
	}

//===================get all pages================================================================
	@RequestMapping("/pages/{pageNumber}")
	public String getNinjasPerPage(Model model, @PathVariable("pageNumber") int pageNumber) {
		System.out.print("\n \n Calling Pages..");
		// we have to subtract 1 because the Pages iterable is 0 indexed. This is for
		// our links to be able to show from 1...pageMax, instead of 0...pageMax
		// class="keyword operator from-rainbow">- 1.
		Page<Ninja> ninjasPages = ninjaService.ninjasPerPage(pageNumber - 1);
		// total number of pages that we have
		int totalPages = ninjasPages.getTotalPages();
		System.out.print("\n \n number of Pages.." + totalPages);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("ninjas", ninjasPages);
		return "ninjas.jsp";
	}
}