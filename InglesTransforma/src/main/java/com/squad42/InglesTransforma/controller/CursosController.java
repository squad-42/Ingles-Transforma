package com.squad42.InglesTransforma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cursos")
public class CursosController {
	
	@GetMapping
	public ModelAndView mostrar(HttpSession session) {
		ModelAndView page = new ModelAndView("/pages/cursos/cursos");
		page.addObject("usuario", session.getAttribute("usuario"));
		return page;
	}
}
