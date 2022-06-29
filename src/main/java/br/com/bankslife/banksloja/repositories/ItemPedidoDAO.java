package br.com.bankslife.banksloja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bankslife.banksloja.dominios.ItemPedido;

@Repository
public interface ItemPedidoDAO extends JpaRepository<ItemPedido, Integer>{

}
