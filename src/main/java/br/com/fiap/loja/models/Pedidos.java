package br.com.fiap.loja.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "pedidosItens")
    private List<PedidosItens> pedidosItens;

    @ManyToOne
    private Cliente cliente;

    public Pedidos(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
