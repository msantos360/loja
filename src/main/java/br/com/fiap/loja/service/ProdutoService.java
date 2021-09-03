package br.com.fiap.loja.service;

import br.com.fiap.loja.models.dtos.ProdutoAddOuUpdateDTO;
import br.com.fiap.loja.models.dtos.ProdutoDto;

import java.util.List;

public interface ProdutoService {
    List<ProdutoDto> getAll();
    ProdutoDto getById(long id);
    ProdutoDto add(ProdutoAddOuUpdateDTO produto);
    ProdutoDto update(ProdutoAddOuUpdateDTO produto);
    void delete(long id);
}
