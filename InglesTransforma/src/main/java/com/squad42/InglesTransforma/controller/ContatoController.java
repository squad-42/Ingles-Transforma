package com.squad42.InglesTransforma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/contato")
public class ContatoController {
	
	@GetMapping
	public ModelAndView mostrar(HttpSession session) {
		ModelAndView page = new ModelAndView("/pages/contato/contato");
		page.addObject("usuario", session.getAttribute("usuario"));
		return page;
	}
}
