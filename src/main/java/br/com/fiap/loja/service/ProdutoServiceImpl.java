package br.com.fiap.loja.service;

import br.com.fiap.loja.models.Dtos.ProdutoAddOuUpdateDTO;
import br.com.fiap.loja.models.Dtos.ProdutoDto;
import br.com.fiap.loja.models.Produto;
import br.com.fiap.loja.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @Override
    public ProdutoDto getById(long id) {
        Produto produto = produtoRepository.findById(id).get();
        return new ProdutoDto(produto);
    }

    @Override
    public List<ProdutoDto> getAll(){
        List<ProdutoDto> lista = new ArrayList<>();
        produtoRepository.findAll().forEach(p -> lista.add(new ProdutoDto(p)));
        return lista;
    }

    @Override
    public ProdutoDto add(ProdutoAddOuUpdateDTO produtoAddOuUpdateDTO){
        Produto produto = produtoRepository.save(new Produto(produtoAddOuUpdateDTO));
        return new ProdutoDto(produto);
    }

    @Override
    public ProdutoDto update(ProdutoAddOuUpdateDTO produtoAddOuUpdateDTO) {
        Produto produto = produtoRepository.save(new Produto(produtoAddOuUpdateDTO));
        return new ProdutoDto(produto);
    }

    @Override
    public void delete(long id) {
        produtoRepository.delete(produtoRepository.findById(id).get());
    }
}
