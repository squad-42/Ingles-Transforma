package com.squad42.InglesTransforma.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "Cursos")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private Professor professor;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private int quantidade_de_aulas;
	@Column(nullable=false)
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	private Date data_de_fechamento;
	@Column(nullable=false)
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	private Date data_de_publicacao;
	public Curso(int id, Professor professor, String nome, int quantidade_de_aulas, Date data_de_fechamento,
			Date data_de_publicacao) {
		super();
		this.id = id;
		this.professor = professor;
		this.nome = nome;
		this.quantidade_de_aulas = quantidade_de_aulas;
		this.data_de_fechamento = data_de_fechamento;
		this.data_de_publicacao = data_de_publicacao;
	}
	public Curso() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade_de_aulas() {
		return quantidade_de_aulas;
	}
	public void setQuantidade_de_aulas(int quantidade_de_aulas) {
		this.quantidade_de_aulas = quantidade_de_aulas;
	}
	public Date getData_de_fechamento() {
		return data_de_fechamento;
	}
	public void setData_de_fechamento(Date data_de_fechamento) {
		this.data_de_fechamento = data_de_fechamento;
	}
	public Date getData_de_publicacao() {
		return data_de_publicacao;
	}
	public void setData_de_publicacao(Date data_de_publicacao) {
		this.data_de_publicacao = data_de_publicacao;
	}

	
}
