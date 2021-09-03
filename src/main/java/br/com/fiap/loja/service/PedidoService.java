package br.com.fiap.loja.service;


import br.com.fiap.loja.models.dtos.PedidoAddDTO;
import br.com.fiap.loja.models.dtos.PedidoDto;

import java.util.List;

public interface PedidoService {

    PedidoDto save (PedidoAddDTO pedidoAddDTO);
    List<PedidoDto> getAllPedidos();
    PedidoDto getPedidoById(Long id);
    void deletePedido(Long id);


}
