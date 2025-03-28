package com.fiec.estoqueia.services.impl;

import com.fiec.estoqueia.business.dtos.FornecedorDTO;
import com.fiec.estoqueia.business.entities.Fornecedor;
import com.fiec.estoqueia.business.repositories.FornecedorRepository;
import com.fiec.estoqueia.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FornecedorServiceImpl implements FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;


    @Override
    public Fornecedor criarFornecedor(FornecedorDTO fornecedor) {
        Fornecedor fornecedorNovo = new Fornecedor();
        fornecedorNovo.setCnpj(fornecedor.getCnpj());
        fornecedorNovo.setNome(fornecedor.getNome());
        return fornecedorRepository.save(fornecedorNovo);
    }

    @Override
    public List<Fornecedor> pegarTodosFornecedores() {
        return fornecedorRepository.findAll();
    }

    // Outros métodos da interface FornecedorService
}