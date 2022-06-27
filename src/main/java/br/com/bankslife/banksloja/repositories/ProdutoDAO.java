package br.com.bankslife.banksloja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bankslife.banksloja.dominios.Produto;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer>{

}
