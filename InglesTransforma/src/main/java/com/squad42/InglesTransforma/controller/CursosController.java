package com.squad42.InglesTransforma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.squad42.InglesTransforma.model.Curso;
import com.squad42.InglesTransforma.repository.CursosRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cursos")
public class CursosController {
	@Autowired
	private CursosRepository cr;
	@GetMapping
	public ModelAndView mostrar(HttpSession session) {
		List <Curso> cursos = cr.findAll();
		ModelAndView page = new ModelAndView("/pages/cursos/cursos");
		page.addObject("usuario", session.getAttribute("usuario"));
		page.addObject("cursos", cursos);
		return page;
	}
}
