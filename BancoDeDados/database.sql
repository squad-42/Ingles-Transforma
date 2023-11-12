CREATE DATABASE db;


USE db;


CREATE TABLE Professores (
  id_professor INT PRIMARY KEY auto_increment,
    nome varchar(255),
    email varchar(255),
    senha varchar(255),
    cpf varchar(255),
    user_role varchar(255),
    data_de_nascimento varchar(255),
    sexo varchar(255)
);

CREATE TABLE Cursos (
    id_curso INT PRIMARY KEY auto_increment,
    id_professor INT,
    nome varchar(255),
    quantidade_de_aulas INT,
    data_de_fechamento date,
    data_de_publicacao date,
	FOREIGN KEY (id_professor) REFERENCES Professores (id_professor)
);



CREATE TABLE Aulas (
 id_aula INT PRIMARY KEY auto_increment,
 id_curso INT,
    nome varchar(100),
    data_da_aula date,
   FOREIGN KEY (id_curso) REFERENCES Cursos (id_curso)
);

CREATE TABLE Alunos (
   id_aluno INT PRIMARY KEY auto_increment,
   id_curso INT,
    nome varchar(100),
	email varchar(255),
    cpf varchar(255),
    user_role varchar(255),
    data_de_nascimento date,
    sexo varchar(255),
  FOREIGN KEY (id_curso) REFERENCES Cursos (id_curso)
);

CREATE TABLE Comentários (
    id_comentario INT PRIMARY KEY auto_increment,
    id_aluno INT,
    comentario varchar(255),
    data_do_comentario date,
     FOREIGN KEY (id_aluno) REFERENCES Alunos (id_aluno)
);
 
ALTER TABLE Alunos ADD CONSTRAINT FK_Alunos_2
    FOREIGN KEY (id_curso)
    REFERENCES Cursos (id_curso)
    ON DELETE CASCADE;
 
ALTER TABLE Cursos ADD CONSTRAINT FK_Cursos_2
    FOREIGN KEY (id_professor)
    REFERENCES Professores (id_professor)
    ON DELETE RESTRICT;
 
ALTER TABLE Aulas ADD CONSTRAINT FK_Aulas_2
    FOREIGN KEY (id_curso)
    REFERENCES Cursos (id_curso)
    ON DELETE RESTRICT;
 
ALTER TABLE Comentários ADD CONSTRAINT FK_Comentários_2
    FOREIGN KEY (id_aluno)
    REFERENCES Alunos (id_aluno)
    ON DELETE CASCADE;