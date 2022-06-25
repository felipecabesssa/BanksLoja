package br.com.bankslife.lojavanelio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bankslife.lojavanelio.dominios.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Shapes");
		Categoria cat2 = new Categoria(2, "Trucks");
		Categoria cat3 = new Categoria(3, "Rodas");	
		
		List<Categoria> lista = new ArrayList<>();

		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		
		return lista;
	}

}
