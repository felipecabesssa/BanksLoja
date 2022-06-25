package br.com.bankslife.lojavanelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bankslife.lojavanelio.dominios.Categoria;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer>{

}
