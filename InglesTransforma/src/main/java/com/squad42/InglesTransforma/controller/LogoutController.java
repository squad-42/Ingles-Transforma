package com.squad42.InglesTransforma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/logout")
public class LogoutController {
	@GetMapping
	public ModelAndView deslogar(HttpSession session) {
		ModelAndView page = new ModelAndView("redirect:/");
		session.setAttribute("usuario", null);
		return page;
	
	}
}
