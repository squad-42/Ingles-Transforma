package com.squad42.InglesTransforma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.squad42.InglesTransforma.model.Aluno;
import com.squad42.InglesTransforma.model.Professor;
import com.squad42.InglesTransforma.repository.AlunoRepository;
import com.squad42.InglesTransforma.repository.ProfessorRepository;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private AlunoRepository ar;
	
	@Autowired
	private ProfessorRepository pr;
	
	@GetMapping
	public ModelAndView mostrar() {
		ModelAndView page = new ModelAndView("/pages/login/login");
		return page;
	}
	
	@PostMapping
	public ModelAndView login(String email, String senha) {
		ModelAndView page = new ModelAndView("redirect:/");
		
		Aluno aluno = ar.findByEmail(email);
		
		Professor professor = pr.findByEmail(email);
		
		if(aluno == null && professor == null) {
			System.out.println("Email ou senha incorretos");
		}else {
			if(aluno != null) {
				if(aluno.getSenha().equals(senha)) {
					page.addObject("usuario", aluno);
					System.out.println(aluno.getNome());
				}else {
					System.out.println("Email ou senha incorretos");
				}
			}
			if(professor != null) {
				if(professor.getSenha().equals(senha)) {
					page.addObject("usuario", professor);
					System.out.println(professor.getNome());
				}else {
					System.out.println("Email ou senha incorretos");
				}
			}
		}
		return page;
	}
}
