package com.squad42.InglesTransforma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.squad42.InglesTransforma.model.Curso;
import com.squad42.InglesTransforma.repository.CursosRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/professor")
public class ProfessorController {
	@Autowired
	private CursosRepository cr;
	
	@GetMapping
	public ModelAndView mostrar(HttpSession session) {
		List<Curso> cursos = cr.findAll(); 
		ModelAndView page = new ModelAndView("/pages/professor/professor");
		page.addObject("usuario", session.getAttribute("usuario"));
		page.addObject("novoCurso", new Curso());
		page.addObject("cursos", cursos);
		
		return page;
	}
	
	@PostMapping
	public ModelAndView cadastrarCurso(Curso novoCurso) {
	ModelAndView page = new ModelAndView("redirect:/professor");
	cr.save(novoCurso);
	return page;
	}
	
	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable Integer id) {
		ModelAndView page = new ModelAndView("redirect:/professor");
		cr.deleteById(id);
		return page;
	}
	
	@PostMapping("/{id}/editar")
	public ModelAndView editar(Curso curso) {
		ModelAndView page = new ModelAndView("redirect:/professor");
		cr.save(curso);
		return page;
	}
}
