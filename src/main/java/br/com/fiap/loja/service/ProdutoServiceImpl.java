package br.com.fiap.loja.service;

import br.com.fiap.loja.models.Dtos.ProdutoAddOuUpdateDTO;
import br.com.fiap.loja.models.Dtos.ProdutoDto;
import br.com.fiap.loja.models.Produto;
import br.com.fiap.loja.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @Override
    @Cacheable(value= "getByIdProduto", key= "#id")
    public ProdutoDto getById(long id) {
        Produto produto = produtoRepository.findById(id).get();
        return new ProdutoDto(produto);
    }

    @Override
    @Cacheable(value= "getAllProdutos", unless= "#result.size() == 0")
    public List<ProdutoDto> getAll(){
        List<ProdutoDto> lista = new ArrayList<>();
        produtoRepository.findAll().forEach(p -> lista.add(new ProdutoDto(p)));
        return lista;
    }

    @Override
    @Caching(
            put= { @CachePut(value= "getAllProdutos", key= "#produtoAddOuUpdateDTO.nome") },
            evict= { @CacheEvict(value= "allProdutos", allEntries= true) }
    )
    public ProdutoDto add(ProdutoAddOuUpdateDTO produtoAddOuUpdateDTO){
        Produto produto = produtoRepository.save(new Produto(produtoAddOuUpdateDTO));
        return new ProdutoDto(produto);
    }

    @Override
    @Caching(
            put= { @CachePut(value= "getAllProdutos", key= "#produtoAddOuUpdateDTO.nome") },
            evict= { @CacheEvict(value= "allProdutos", allEntries= true) }
    )
    public ProdutoDto update(ProdutoAddOuUpdateDTO produtoAddOuUpdateDTO) {
        Produto produto = produtoRepository.save(new Produto(produtoAddOuUpdateDTO));
        return new ProdutoDto(produto);
    }

    @Override
    @Caching(
            evict= {
                    @CacheEvict(value= "getAllProdutos", key= "#id"),
                    @CacheEvict(value= "allProdutos", allEntries= true)
            }
    )
    public void delete(long id) {
        produtoRepository.delete(produtoRepository.findById(id).get());
    }
}
