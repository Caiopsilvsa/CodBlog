package com.spring.CodeBlog.models;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;



@Table(name = "TB_POST")
@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id ;
	
	@Column(name = "autor")
	public String autor;
	
	@Column(name = "titulo")
	public String titulo;
	
	@Column(name = "data")
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	public LocalDate data;
	
	@Column(name = "Texto")
	public String texto;

	public void setData(LocalDate now) {
	        this.data = now;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	} 
	
	
	
}
