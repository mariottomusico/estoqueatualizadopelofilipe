package com.fiec.estoqueia.services.impl;

import com.fiec.estoqueia.business.dtos.ProdutoDTO;
import com.fiec.estoqueia.business.entities.Produto;
import com.fiec.estoqueia.business.repositories.ProdutoRepository;
import com.fiec.estoqueia.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    @Override
    public Produto criarProduto(ProdutoDTO produto) {
        Produto produtoNovo = new Produto();
        produtoNovo.setNome(produto.getNome());
        produtoNovo.setAtributos(produto.getAtributos());
        produtoNovo.setDescricao(produto.getDescricao());
        produtoNovo.setImagem(produto.getImagem());
        produtoNovo.setValidade(produto.getValidade());
        produtoNovo.setCategoriaId(produto.getCategoriaId());
        produtoNovo.setFornecedorId(produto.getFornecedorId());
        return produtoRepository.save(produtoNovo);
    }

    @Override
    public List<Produto> pegarTodosProdutos() {
        return produtoRepository.findAll();
    }

    // Outros métodos da interface ProdutoService
}