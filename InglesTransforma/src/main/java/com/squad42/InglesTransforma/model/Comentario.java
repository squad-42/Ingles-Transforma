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
@Table(name= "Comentarios")
public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Aluno aluno;
	@Column(nullable=false)
	private String comentario;
	@Column(nullable=false)
	private Date data_de_nascimento;
	public Comentario(int id, Aluno aluno, String comentario, Date data_de_nascimento) {
		super();
		this.id = id;
		this.aluno=aluno;
		this.comentario = comentario;
		this.data_de_nascimento = data_de_nascimento;
	}
	public Comentario() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno=aluno;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Date getData_de_nascimento() {
		return data_de_nascimento;
	}
	public void setData_de_nascimento(Date data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	
}
