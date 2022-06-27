package br.com.bankslife.lojavanelio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.bankslife.lojavanelio.dominios.Categoria;
import br.com.bankslife.lojavanelio.dominios.Produto;
import br.com.bankslife.lojavanelio.repositories.CategoriaDAO;
import br.com.bankslife.lojavanelio.repositories.ProdutoDAO;

@SpringBootApplication
public class LojavanelioApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	private ProdutoDAO produtoDAO;

	public static void main(String[] args) {
		SpringApplication.run(LojavanelioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Shapes");
		Categoria cat2 = new Categoria(null, "Trucks");
		Categoria cat3 = new Categoria(null, "Rodas");
		Categoria cat4 = new Categoria(null, "Roupas");
		
		Produto p1 = new Produto(null, "Shape felipe gustavo", 200.00);
		Produto p2 = new Produto(null, "Shape Lehi Leite", 200.00);
		Produto p3 = new Produto(null, "Shape Fluido", 150.00);
		Produto p4 = new Produto(null, "Camiseta manga comprida BANKSLFIE", 200.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1));
		cat1.getProdutos().addAll(Arrays.asList(p2));
		cat1.getProdutos().addAll(Arrays.asList(p3));
		cat4.getProdutos().addAll(Arrays.asList(p4));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		p4.getCategorias().addAll(Arrays.asList(cat4));
		
		categoriaDAO.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		produtoDAO.saveAll(Arrays.asList(p1, p2, p3, p4));
		
	}
	
	

}
