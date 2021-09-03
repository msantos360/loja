package br.com.fiap.loja.models.dtos;

import java.io.Serializable;

public class ProdutoAddOuUpdateDTO  implements Serializable  {
    private static final long serialVersionUID = 1L;

    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
