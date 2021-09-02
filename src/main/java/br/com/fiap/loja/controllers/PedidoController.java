package br.com.fiap.loja.controllers;

import br.com.fiap.loja.models.Dtos.PedidoAddDTO;
import br.com.fiap.loja.models.Dtos.PedidoDto;
import br.com.fiap.loja.service.ClienteService;
import br.com.fiap.loja.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;


@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;
    private final ClienteService clienteService;

    @Autowired
    public PedidoController(PedidoService pedidoService, ClienteService clienteService) {
        this.pedidoService = pedidoService;
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<PedidoDto> addPedido(
            @Validated @RequestBody PedidoAddDTO pedido, UriComponentsBuilder builder
    ) {
        PedidoDto pedidoDto = pedidoService.save(pedido);
        return new ResponseEntity<PedidoDto>(pedidoDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getAllPedidos(){
        List<PedidoDto> pedidoDTO = pedidoService.getAllPedidos();
        return ResponseEntity.status(HttpStatus.OK).body(pedidoDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable("id") Long id) {
        pedidoService.deletePedido(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("{id}")
    public ResponseEntity<PedidoDto> findPedido(@PathVariable("id") Long id) {
        PedidoDto pedidoDto = pedidoService.getPedidoById(id);
        return new ResponseEntity<PedidoDto>(pedidoDto, HttpStatus.OK);
    }

}
