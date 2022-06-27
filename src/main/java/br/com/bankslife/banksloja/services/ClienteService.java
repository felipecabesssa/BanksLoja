package br.com.bankslife.banksloja.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bankslife.banksloja.dominios.Cliente;
import br.com.bankslife.banksloja.repositories.ClienteDAO;
import br.com.bankslife.banksloja.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteDAO repo;

//  Cliente é o tipo de dado que o método retorna, assim como List, String etc

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}

}
