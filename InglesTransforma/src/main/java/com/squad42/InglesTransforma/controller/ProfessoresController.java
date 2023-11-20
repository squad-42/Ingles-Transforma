package com.squad42.InglesTransforma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.squad42.InglesTransforma.model.Professor;
import com.squad42.InglesTransforma.repository.ProfessorRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/professores")
public class ProfessoresController {
	
	@Autowired
	private ProfessorRepository pr;
	
	@GetMapping
	public ModelAndView mostrar(HttpSession session) {
		List<Professor> professores = pr.findAll();
		ModelAndView page = new ModelAndView("/pages/professores/professores");
		page.addObject("usuario", session.getAttribute("usuario"));
		page.addObject("professores", professores);
		return page;
	}
	
	@GetMapping("/imagem/{id}")
	@ResponseBody
	public byte[] exibirImagem(@PathVariable("id") Integer id) {
		Professor professor = this.pr.getReferenceById(id);
		return professor.getImagem();
	}

}
