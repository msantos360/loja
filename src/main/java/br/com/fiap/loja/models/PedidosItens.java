package br.com.fiap.loja.models;

import javax.persistence.*;

@Entity
@Table(name = "pedidosItens", schema = "loja")
public class PedidosItens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Long quantidade;
    @Column(nullable = false)
    private Double valor;
    @Column(nullable = false)
    private Long produto_id;

    @ManyToOne
    private Produto Produto;
    
    @ManyToOne
    private Pedidos pedidos;
    
    public PedidosItens() {}

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }
}
