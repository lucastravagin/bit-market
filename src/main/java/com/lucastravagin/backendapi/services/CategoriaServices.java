package com.lucastravagin.backendapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucastravagin.backendapi.domain.Categoria;
import com.lucastravagin.backendapi.repositories.CategoriaRepository;

@Service
public class CategoriaServices {
	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
