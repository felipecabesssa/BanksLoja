package br.com.bankslife.banksloja.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bankslife.banksloja.dominios.Categoria;
import br.com.bankslife.banksloja.repositories.CategoriaDAO;
import br.com.bankslife.banksloja.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaDAO repo;

//  Categoria é o tipo de dado que o método retorna, assim como List, String etc

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}

}
