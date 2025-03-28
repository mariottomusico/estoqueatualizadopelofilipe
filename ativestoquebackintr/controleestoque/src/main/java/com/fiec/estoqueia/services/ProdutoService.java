package com.fiec.estoqueia.services;

import com.fiec.estoqueia.business.dtos.ProdutoDTO;
import com.fiec.estoqueia.business.entities.Produto;
import java.util.List;

public interface ProdutoService {
    Produto criarProduto(ProdutoDTO produto);
    List<Produto> pegarTodosProdutos();
    // Outros métodos da lógica de negócios (atualizar, excluir, etc.)
}