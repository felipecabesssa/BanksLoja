package br.com.bankslife.banksloja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bankslife.banksloja.dominios.Endereco;

@Repository
public interface EnderecoDAO extends JpaRepository<Endereco, Integer>{

}
