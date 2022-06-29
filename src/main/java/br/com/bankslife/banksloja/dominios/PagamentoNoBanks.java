package br.com.bankslife.banksloja.dominios;

import java.util.Date;

import javax.persistence.Entity;

import br.com.bankslife.banksloja.dominios.enuns.EstadoPagamento;

@Entity
public class PagamentoNoBanks extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Date dataPagamento;
	private String instagram;
	
	public PagamentoNoBanks() {
	}

	public PagamentoNoBanks(Integer id, EstadoPagamento estado, Pedido pedido, Date dataPagamento, String instagram) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.instagram = instagram;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	
}
