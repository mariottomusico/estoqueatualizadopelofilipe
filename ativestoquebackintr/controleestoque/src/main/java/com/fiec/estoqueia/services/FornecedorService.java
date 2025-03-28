package com.fiec.estoqueia.services;

import com.fiec.estoqueia.business.dtos.FornecedorDTO;
import com.fiec.estoqueia.business.entities.Fornecedor;
import java.util.List;

public interface FornecedorService {
    Fornecedor criarFornecedor(FornecedorDTO fornecedor);
    List<Fornecedor> pegarTodosFornecedores();
    // Outros métodos da lógica de negócios (atualizar, excluir, etc.)
}
