package br.com.fiap.loja.models.Dtos;

import br.com.fiap.loja.models.Cliente;
import br.com.fiap.loja.models.Pedido;
import br.com.fiap.loja.models.PedidoItens;

import java.time.LocalDate;
import java.util.List;

public class PedidoDto {

    private Long id;
    private LocalDate dataPedido;
    private List<PedidoItens> pedidoItens;
    private Cliente cliente;

    public PedidoDto(Pedido pedido) {
        this.id = pedido.getId();
        this.dataPedido = pedido.getDataPedido();
        this.pedidoItens = pedido.getPedidoItens();
        this.cliente = pedido.getCliente();
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
