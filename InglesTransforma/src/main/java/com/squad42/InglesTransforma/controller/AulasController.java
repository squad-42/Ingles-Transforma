package com.squad42.InglesTransforma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/aulas")
public class AulasController {
	
	@GetMapping
	public ModelAndView mostrar() {
		ModelAndView page = new ModelAndView("/pages/aulas/aulas");
		return page;
	}
}
