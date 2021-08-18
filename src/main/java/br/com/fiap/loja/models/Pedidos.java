package br.com.fiap.loja.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos", schema = "loja")
public class Pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate dataPedido = LocalDate.now();

	@OneToMany(mappedBy = "pedidos")
	private List<PedidosItens> pedidosItens;

	@ManyToOne
	private Cliente cliente;

	public Pedidos() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public List<PedidosItens> getPedidosItens() {
		return pedidosItens;
	}

	public void setPedidosItens(List<PedidosItens> pedidosItens) {
		this.pedidosItens = pedidosItens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
