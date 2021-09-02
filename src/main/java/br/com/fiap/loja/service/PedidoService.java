package br.com.fiap.loja.service;


import br.com.fiap.loja.models.Dtos.PedidoAddDTO;
import br.com.fiap.loja.models.Dtos.PedidoDto;
import br.com.fiap.loja.models.Dtos.ProdutoAddOuUpdateDTO;
import br.com.fiap.loja.models.Dtos.ProdutoDto;
import br.com.fiap.loja.models.Pedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PedidoService {

    PedidoDto save (PedidoAddDTO pedidoAddDTO);
    List<PedidoDto> getAllPedidos();
    PedidoDto getPedidoById(Long id);
    void deletePedido(Long id);


}
