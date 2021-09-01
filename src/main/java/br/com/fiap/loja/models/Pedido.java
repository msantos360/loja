package br.com.fiap.loja.models;

import br.com.fiap.loja.models.Dtos.PedidoAddDTO;
import br.com.fiap.loja.models.Dtos.ProdutoAddOuUpdateDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "pedidos", schema = "loja")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate dataPedido = LocalDate.now();

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<PedidoItens> pedidoItens;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id",  referencedColumnName = "id")
	private Cliente cliente;


	public Pedido() {

	}

	public Pedido(Long id, LocalDate dataPedido, List<PedidoItens> pedidoItens, Cliente cliente) {
		this.id = id;
		this.dataPedido = dataPedido;
		this.pedidoItens = pedidoItens;
		this.cliente = cliente;
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

	public List<PedidoItens> getPedidoItens() {
		return pedidoItens;
	}

	public void setPedidoItens(List<PedidoItens> pedidoItens) {
		this.pedidoItens = pedidoItens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
