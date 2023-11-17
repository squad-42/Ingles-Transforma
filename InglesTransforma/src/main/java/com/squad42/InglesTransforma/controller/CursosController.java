package com.squad42.InglesTransforma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cursos")
public class CursosController {
	
	@GetMapping
	public ModelAndView mostrar() {
		ModelAndView page = new ModelAndView("/pages/cursos/cursos");
		return page;
	}
}
