package br.com.fiap.loja.controllers;

import br.com.fiap.loja.models.Dtos.ProdutoAddOuUpdateDTO;
import br.com.fiap.loja.models.Dtos.ProdutoDto;
import br.com.fiap.loja.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> getAllProdutos() {
        List<ProdutoDto> lista = produtoService.getAll();
        return new ResponseEntity<List<ProdutoDto>>(lista, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProdutoDto> getProdutoById(@PathVariable("id") Long id) {
        ProdutoDto produto = produtoService.getById(id);
        return new ResponseEntity<ProdutoDto>(produto, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ProdutoDto> addProduto(@RequestBody ProdutoAddOuUpdateDTO produto, UriComponentsBuilder builder) {
        ProdutoDto savedProduto = produtoService.add(produto);
        return new ResponseEntity<ProdutoDto>(savedProduto, HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<ProdutoDto> updateProduto(@RequestBody ProdutoAddOuUpdateDTO produto) {
        ProdutoDto updatedProduto =  produtoService.update(produto);
        return new ResponseEntity<ProdutoDto>(updatedProduto, HttpStatus.OK);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Long id) {
        produtoService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
