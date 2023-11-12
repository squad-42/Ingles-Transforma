package com.squad42.InglesTransforma.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "Aulas")
public class Aula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Curso curso;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private Date data_da_aula;
	public Aula(int id, Curso curso, String nome, Date data_da_aula) {
		super();
		this.id = id;
		this.curso = curso;
		this.nome = nome;
		this.data_da_aula = data_da_aula;
	}
	public Aula() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_da_aula() {
		return data_da_aula;
	}
	public void setData_da_aula(Date data_da_aula) {
		this.data_da_aula = data_da_aula;
	}
	

}
