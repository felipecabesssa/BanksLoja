package br.com.bankslife.lojavanelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bankslife.lojavanelio.dominios.Produto;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer>{

}
