package com.lucastravagin.backendapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucastravagin.backendapi.domain.Categoria;
import com.lucastravagin.backendapi.domain.Produto;
import com.lucastravagin.backendapi.repositories.CategoriaRepository;
import com.lucastravagin.backendapi.repositories.ProdutoRepository;

@SpringBootApplication
public class BitMarketApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository  produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BitMarketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2.55);
		Produto p2 = new Produto(null, "Impressora", 3.99);
		Produto p3 = new Produto(null, "Mouse", 2.89);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}
}
