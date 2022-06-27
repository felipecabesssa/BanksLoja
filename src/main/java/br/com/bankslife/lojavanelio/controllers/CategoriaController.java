package br.com.bankslife.lojavanelio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bankslife.lojavanelio.dominios.Categoria;
import br.com.bankslife.lojavanelio.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {

		Categoria cat1 = new Categoria(1, "Shapes");
		Categoria cat2 = new Categoria(2, "Trucks");
		Categoria cat3 = new Categoria(3, "Rodas");	
		Categoria cat4 = new Categoria(4, "Roupas");

		List<Categoria> lista = new ArrayList<>();

		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);

		return lista;
	}

}
