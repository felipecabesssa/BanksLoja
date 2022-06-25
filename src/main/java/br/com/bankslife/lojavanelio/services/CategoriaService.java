package br.com.bankslife.lojavanelio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bankslife.lojavanelio.dominios.Categoria;
import br.com.bankslife.lojavanelio.repositories.CategoriaDAO;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaDAO repo;

//  Categoria é o tipo de dado que o método retorna, assim como List, String etc

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
