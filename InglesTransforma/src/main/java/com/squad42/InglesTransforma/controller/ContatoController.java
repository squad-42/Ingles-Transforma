package com.squad42.InglesTransforma.controller;

import java.io.IOException;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import com.squad42.InglesTransforma.model.Contato;
import com.squad42.InglesTransforma.repository.ContatoRepository;
 
@Controller
@RequestMapping("/contato")
public class ContatoController {
 
	@Autowired
	private ContatoRepository contatoRepository;
 
	// lista todos os dados do banco contato
	@GetMapping("/listarcontato")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("contato/listar.html");
 
		List<Contato> contatos = contatoRepository.findAll();
		modelAndView.addObject("contatos", contatos);
 
		return modelAndView;
	}
 
	// chama a view cadastrar e passa um objeto vazio
	@GetMapping("/contato")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("contato/contato.html");
 
		modelAndView.addObject("contato", new Contato());
 
		return modelAndView;
	}
 
	@PostMapping("/contato")
	public ModelAndView cadastrar(Contato contato) throws IOException {
 		
		contatoRepository.save(contato);
		
		ModelAndView modelAndView = new ModelAndView("contato/contatosucesso.html");		
 
		return modelAndView;
	}	
	
	@GetMapping("/{id}/editar")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("contato/editar.html");
 
		Contato contato = contatoRepository.getReferenceById(id);
		modelAndView.addObject("contato", contato);
 
		return modelAndView;
	}
 
	@PostMapping("/{id}/editar")
	public ModelAndView editar(Contato contato) {		
 
		contatoRepository.save(contato);
		ModelAndView modelAndView = new ModelAndView("contato/contatosucesso.html");
 
		return modelAndView;
	}
	
	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable Long id) {
	    ModelAndView modelAndView = new ModelAndView("contato/contatosucesso.html");

	    Contato contato = contatoRepository.getReferenceById(id);
	    contatoRepository.deleteById(id);

	    modelAndView.addObject("contato", contato);

	    return modelAndView;
	}
}