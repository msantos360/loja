package br.com.fiap.loja.controllers;

import br.com.fiap.loja.models.dto.ClienteDTO;
import br.com.fiap.loja.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("{id}")
    public ResponseEntity getClienteById(@PathVariable Long id){
    ClienteDTO clienteDTO = clienteService.getClienteById(id);
    return ResponseEntity.status(HttpStatus.OK).body(clienteDTO);
    }

    @PostMapping
    public ResponseEntity insertCliente(@RequestBody ClienteDTO clienteDTO){
        clienteService.insertCliente(clienteDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity getAllClientes(){
        List<ClienteDTO> clientesDTO = clienteService.getAllClientes();
        return ResponseEntity.status(HttpStatus.OK).body(clientesDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteCliente(@PathVariable Long id){
       clienteService.deleteCliente(id);
       return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("{id}")
    public ResponseEntity updateCliente(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO){
        clienteService.updateCliente(id, clienteDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }







}
