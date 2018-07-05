package com.lucastravagin.backendapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.lucastravagin.backendapi.domain.Categoria;
import com.lucastravagin.backendapi.repositories.CategoriaRepository;

@SpringBootApplication
public class BitMarketApplication implements CommandLineRunner  {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BitMarketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Alimentos");
		Categoria cat2 = new Categoria(null, "Saúde");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));

	}
}
