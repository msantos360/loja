package br.com.fiap.loja.models.Dtos;

import java.util.List;

public class PedidoAddDTO {

    private String cpf;

    private List<PedidoItensDTO> itens;


    public PedidoAddDTO(String cpf,
                        List<PedidoItensDTO> itens) {
        this.cpf = cpf;
        this.itens = itens;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<PedidoItensDTO> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItensDTO> itens) {
        this.itens = itens;
    }

}
