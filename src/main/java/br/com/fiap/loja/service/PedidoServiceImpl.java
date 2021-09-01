package br.com.fiap.loja.service;

import br.com.fiap.loja.models.Cliente;
import br.com.fiap.loja.models.Dtos.PedidoAddDTO;
import br.com.fiap.loja.models.Dtos.PedidoDto;
import br.com.fiap.loja.models.Pedido;
import br.com.fiap.loja.models.PedidoItens;
import br.com.fiap.loja.repository.ClienteRepository;
import br.com.fiap.loja.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;


    @Autowired
    public PedidoServiceImpl(PedidoRepository pedidosRepository, ClienteRepository clienteRepository) {
        this.pedidoRepository = pedidosRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    @Transactional
    public PedidoDto save(PedidoAddDTO pedidoAddDTO) {
        Pedido pedidoNew = new Pedido();
        Cliente cliente = clienteRepository.findClienteByCpf(pedidoAddDTO.getCpf());

        pedidoNew.setDataPedido(LocalDate.now());

        List<PedidoItens> itens = new ArrayList<>();
        PedidoItens lista = new PedidoItens();

        for (int i = 0; i < pedidoAddDTO.getItens().size(); i++) {

            lista.setNome(pedidoAddDTO.getItens().get(i).getNome());
            lista.setQuantidade(pedidoAddDTO.getItens().get(i).getQuantidade());
            lista.setValor(pedidoAddDTO.getItens().get(i).getValor());
            lista.setProduto(pedidoAddDTO.getItens().get(i).getProduto());
            lista.setPedido(pedidoNew);

            itens.add(lista);

        }
        pedidoNew.setPedidoItens(itens);
        pedidoNew.setCliente(cliente);

        Pedido pedido = pedidoRepository.save(pedidoNew);
        return new PedidoDto(pedido);
    }

    @Override
    public List<PedidoDto> getAllPedidos() {
        List<PedidoDto> lista = new ArrayList<>();
        pedidoRepository.findAll().forEach(p -> lista.add(new PedidoDto(p)));
        return lista;
    }

    @Override
    public void deletePedido(Long id) {
        pedidoRepository.delete(pedidoRepository.findById(id).get());
    }

    @Override
    public PedidoDto getPedidoById(Long id) {
        Pedido pedido = pedidoRepository.findById(id).get();
        return new PedidoDto(pedido);
    }


}
