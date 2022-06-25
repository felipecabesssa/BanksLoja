package br.com.bankslife.lojavanelio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.bankslife.lojavanelio.dominios.Categoria;
import br.com.bankslife.lojavanelio.repositories.CategoriaDAO;

@SpringBootApplication
public class LojavanelioApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaDAO categoriaDAO;

	public static void main(String[] args) {
		SpringApplication.run(LojavanelioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Shapes");
		Categoria cat2 = new Categoria(null, "Trucks");
		Categoria cat3 = new Categoria(null, "Rodas");
		Categoria cat4 = new Categoria(null, "Roupas");
		
		categoriaDAO.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		
	}
	
	

}
