package com.squad42.InglesTransforma.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "Alunos")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Curso curso;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String senha;
	@Column(nullable=false)
	private String cpf;
	@Column(nullable=false)
	private String user_role;
	@Column(nullable=false)
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")

	private Date data_de_nascimento;
	@Column(nullable=false)
	private String sexo;
	public Aluno(int id, Curso curso, String nome, String email, String senha, String cpf, String user_role,
			Date data_de_nascimento, String sexo) {
		super();
		this.id = id;
		this.curso=curso;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.user_role = user_role;
		this.data_de_nascimento = data_de_nascimento;
		this.sexo = sexo;
	}
	public Aluno() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Curso  getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso=curso;
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
	public Date getData_de_nascimento() {
		return data_de_nascimento;
	}
	public void setData_de_nascimento(Date data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

}
