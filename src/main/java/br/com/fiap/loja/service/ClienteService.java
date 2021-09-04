package br.com.fiap.loja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.loja.models.Cliente;
import br.com.fiap.loja.models.Enderecos;
import br.com.fiap.loja.models.dtos.ClienteDTO;
import br.com.fiap.loja.repository.ClienteRepository;
import br.com.fiap.loja.repository.EnderecosRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecosRepository enderecosRepository;

	@Cacheable(value = "getClienteById", key = "#id")
	@Transactional
	public ClienteDTO getClienteById(Long id) {
		Cliente cliente = clienteRepository.getById(id);
		return modelToDTO(cliente);
	}

	@Cacheable(value = "getAllClientes", unless = "#result.size() == 0")
	@Transactional
	public List<ClienteDTO> getAllClientes() {
		List<Cliente> listaClientes;
		List<ClienteDTO> clienteDTOList = new ArrayList<>();
		listaClientes = clienteRepository.findAll();
		for (Cliente cliente : listaClientes) {
			clienteDTOList.add(modelToDTO(cliente));
		}
		return clienteDTOList;
	}

	@Caching(evict = { @CacheEvict(value = "getAllClientes", key = "#id"),
			@CacheEvict(value = "allClientes", allEntries = true) })
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	public void insertCliente(ClienteDTO clienteDTO) {
		List<Enderecos> enderecosList = clienteDTO.getEnderecos();
		Cliente clienteAux = dtoToModel(clienteDTO);
		enderecosList.forEach(e -> e.setCliente(clienteAux));
		enderecosRepository.saveAll(enderecosList);
		clienteRepository.save(clienteAux);
	}

	public void updateCliente(Long id, ClienteDTO clienteDTO) {
		clienteRepository.findById(id).map(c -> {
			c.setDataNascimento(clienteDTO.getDataNascimento());
			c.setEnderecos(clienteDTO.getEnderecos());
			c.setPedidos(clienteDTO.getPedidos());
			c.setNome(clienteDTO.getNome());
			List<Enderecos> enderecosList;
			enderecosList = c.getEnderecos();
			enderecosList.forEach(e -> e.setCliente(c));
			enderecosRepository.saveAll(enderecosList);
			Cliente cliente = clienteRepository.save(c);
			return null;
		});

	}

	private ClienteDTO modelToDTO(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setId(cliente.getId());
		clienteDTO.setCpf(cliente.getCpf());
		clienteDTO.setEnderecos(cliente.getEnderecos());
		clienteDTO.setDataNascimento(cliente.getDataNascimento());
		clienteDTO.setNome(cliente.getNome());
		clienteDTO.setPedidos(cliente.getPedidos());
		return clienteDTO;
	}

	private Cliente dtoToModel(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setId(clienteDTO.getId());
		cliente.setCpf(clienteDTO.getCpf());
		cliente.setEnderecos(clienteDTO.getEnderecos());
		cliente.setDataNascimento(clienteDTO.getDataNascimento());
		cliente.setNome(clienteDTO.getNome());
		cliente.setPedidos(clienteDTO.getPedidos());
		return cliente;
	}

}
