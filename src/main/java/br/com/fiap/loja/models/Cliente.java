package br.com.fiap.loja.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "cliente", schema = "loja")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String cpf;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Enderecos> enderecos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
    private List<Pedido> pedidos;
    
    public Cliente() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Enderecos> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Enderecos> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
    
    
}
