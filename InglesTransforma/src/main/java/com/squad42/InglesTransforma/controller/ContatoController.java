package com.squad42.InglesTransforma.controller;

import com.squad42.InglesTransforma.model.Contato;
import com.squad42.InglesTransforma.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContatoController {

    private final ContatoRepository contatoRepository;

    @Autowired
    public ContatoController(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @GetMapping("/contato")
    public String showContatoPage(Model model) {
        model.addAttribute("contato", new Contato());
        return "contato";
    }

    @PostMapping("/contato")
    public String processContatoForm(Contato contato) {
        // Lógica para processar os dados do formulário
        // Salvar no banco de dados usando o Spring Data JPA
        contatoRepository.save(contato);

        // Exemplo de exibição dos dados no console:
        System.out.println("Nome: " + contato.getName());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("Telefone: " + contato.getTel());
        System.out.println("Mensagem: " + contato.getMsg());

        return "redirect:/contato"; // Redireciona de volta para a página de contato
    }
}
