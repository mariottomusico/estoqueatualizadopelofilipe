package com.fiec.estoqueia.controllers;

import com.fiec.estoqueia.business.dtos.ProdutoDTO;
import com.fiec.estoqueia.business.entities.Produto;
import com.fiec.estoqueia.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto criarProduto(@RequestBody ProdutoDTO produto) {
        return produtoService.criarProduto(produto);
    }

    @GetMapping
    public List<Produto> pegarTodosProdutos() {
        return produtoService.pegarTodosProdutos();
    }
}
