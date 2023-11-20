package com.squad42.InglesTransforma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.squad42.InglesTransforma.model.Aluno;
import com.squad42.InglesTransforma.model.Professor;
import com.squad42.InglesTransforma.repository.AlunoRepository;
import com.squad42.InglesTransforma.repository.ProfessorRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
@SessionAttributes("usuario")
public class LoginController {
	@Autowired
	private AlunoRepository ar;
	
	@Autowired
	private ProfessorRepository pr;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping
	public ModelAndView mostrar() {
		ModelAndView page = new ModelAndView("/pages/login/login");
		return page;
	}
	
	@PostMapping
	public ModelAndView login(String email, String senha, HttpSession session) {
		ModelAndView page = new ModelAndView("redirect:/");
		
		
		Aluno aluno = ar.findByEmail(email);
		
		Professor professor = pr.findByEmail(email);
		
		if(aluno == null && professor == null) {
			System.out.println("Email ou senha incorretos");
		}else {
			if(aluno != null) {
				if(passwordEncoder.matches(senha,aluno.getSenha())) {
					session.setAttribute("usuario", aluno);
					System.out.println(aluno.getNome());
				}else {
					System.out.println("Email ou senha incorretos");
				}
			}
			if(professor != null) {
				if(passwordEncoder.matches(senha,professor.getSenha())) {
					session.setAttribute("usuario", professor);
					System.out.println(professor.getNome());
				}else {
					System.out.println("Email ou senha incorretos");
				}
			}
		}
		return page;
	}
}
