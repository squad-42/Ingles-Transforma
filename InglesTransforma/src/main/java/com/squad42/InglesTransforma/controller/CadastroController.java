package com.squad42.InglesTransforma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.squad42.InglesTransforma.model.Aluno;
import com.squad42.InglesTransforma.model.Professor;
import com.squad42.InglesTransforma.model.Usuario;
import com.squad42.InglesTransforma.repository.AlunoRepository;
import com.squad42.InglesTransforma.repository.ProfessorRepository;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {
	
	@Autowired
	private AlunoRepository ar;
	
	@Autowired 
	private ProfessorRepository pr;
	
	 @Autowired
	    private PasswordEncoder passwordEncoder;
	
	@GetMapping
	public ModelAndView mostrar() {
		ModelAndView page = new ModelAndView("/pages/cadastro/cadastro");
		page.addObject("usuario", new Usuario());
		return page;
	}
	
	@PostMapping
	public ModelAndView cadastrar(Usuario usuario) {
		if(usuario.getUser_role().equals("aluno")) {
			System.out.println("Aluno");
			Aluno aluno = new Aluno();
			aluno.setNome(usuario.getNome());
			aluno.setEmail(usuario.getEmail());
			String hashedPassword = passwordEncoder.encode(usuario.getSenha());
			aluno.setSenha(hashedPassword);
			aluno.setCpf(usuario.getCpf());
			aluno.setUser_role(usuario.getUser_role());
			aluno.setData_de_nascimento(usuario.getData_de_nascimento());
			aluno.setSexo(usuario.getSexo());
			
			ar.save(aluno);
		}else {
			Professor professor = new Professor();
			professor.setNome(usuario.getNome());
			professor.setEmail(usuario.getEmail());
			String hashedPassword = passwordEncoder.encode(usuario.getSenha());
			professor.setSenha(hashedPassword);
			professor.setCpf(usuario.getCpf());
			professor.setUser_role(usuario.getUser_role());
			professor.setData_de_nascimento(usuario.getData_de_nascimento());
			professor.setSexo(usuario.getSexo());
			
			pr.save(professor);		
		}
		ModelAndView page = new ModelAndView("redirect:/");
		return page;
	}
}
