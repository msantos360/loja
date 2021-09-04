package br.com.fiap.loja.service;

import br.com.fiap.loja.models.Dtos.ProdutoAddOuUpdateDTO;
import br.com.fiap.loja.models.Dtos.ProdutoDto;

import java.util.List;

public interface ProdutoService {
    List<ProdutoDto> getAll();
    ProdutoDto getById(long id);
    ProdutoDto add(ProdutoAddOuUpdateDTO produto);
    ProdutoDto update(Long id, ProdutoAddOuUpdateDTO produto);
    void delete(long id);
}
