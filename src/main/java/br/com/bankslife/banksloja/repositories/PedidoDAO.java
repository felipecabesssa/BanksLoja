package br.com.bankslife.banksloja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bankslife.banksloja.dominios.Pedido;

@Repository
public interface PedidoDAO extends JpaRepository<Pedido, Integer>{

}
