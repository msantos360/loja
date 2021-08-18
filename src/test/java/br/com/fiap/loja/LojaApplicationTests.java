package br.com.fiap.loja;

import java.time.LocalDate;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.fiap.loja.models.Cliente;
import br.com.fiap.loja.models.Enderecos;
import br.com.fiap.loja.repository.ClienteRepository;

@SpringBootTest
class LojaApplicationTests {

	@Autowired
	private ClienteRepository clienteRepository;

	@Test
	public void criaCliente() {
		Cliente iago = new Cliente();
		LinkedList<Enderecos> listaDeEnderecos = new LinkedList<>();
		Enderecos enderecoDoIago = new Enderecos();

		enderecoDoIago.setBairro("Jardim Universal");
		enderecoDoIago.setCidade("Sarandi");
		enderecoDoIago.setLogradouro("Avenida Universal");
		enderecoDoIago.setNumero("42");
		enderecoDoIago.setUf("PR");

		listaDeEnderecos.add(enderecoDoIago);

		iago.setCpf("129.240.846-44");
		iago.setDataNascimento(LocalDate.now().minusYears(22));
		iago.setNome("Iago Emanuel Cláudio Fogaça");
		iago.setEnderecos(listaDeEnderecos);

		clienteRepository.save(iago);

	}

}
