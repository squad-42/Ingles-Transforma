package com.squad42.InglesTransforma.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Usuario {

	private int id;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String user_role;
	private String sexo;
	
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	private Date data_de_nascimento;

	public Usuario() {
		super();
	}

	public Usuario(int id, String nome, String email, String senha, String cpf, String user_role, String sexo,
			Date data_de_nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.user_role = user_role;
		this.sexo = sexo;
		this.data_de_nascimento = data_de_nascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData_de_nascimento() {
		return data_de_nascimento;
	}

	public void setData_de_nascimento(Date data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}

}
