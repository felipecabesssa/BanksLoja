package br.com.bankslife.banksloja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bankslife.banksloja.dominios.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer>{

}
