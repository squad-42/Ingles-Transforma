package com.squad42.InglesTransforma.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;
    
    @Column (nullable = false)
    private String email;
    
    @Column (nullable = false)
    private String telefone;
    
    @Column (nullable = false)
    private String mensagem;

    
    //Construtor
    public Contato() {    	
    }
    
    public Contato(Long id, String nome, String email, String telefone, String mensagem) {
    	this.id = id;
    	this.nome = nome;
    	this.email = email;
    	this.telefone = telefone;
    	this.mensagem = mensagem;
    }
    
    
    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }   
    
}
