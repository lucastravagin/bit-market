package com.lucastravagin.backendapi.domain;

import java.io.Serializable;

//Esta classe implementa a interface Serializable, os objetos dela poderão ser convertidos para um sequencia de Bytes.
public class Categoria implements Serializable{
	//Atributos Básicos
	private Integer id;
	private String nome;
	
	//Método Construtor
	public Categoria() {	
	}


	//Contrutor para os atributos
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	//Getters e Setters (Encapsulamento)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	//hashCode (Compara os objetos pelo conteúdo)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
