package com.fiec.estoqueia.controllers;

import com.fiec.estoqueia.business.dtos.FornecedorDTO;
import com.fiec.estoqueia.business.entities.Fornecedor;
import com.fiec.estoqueia.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public Fornecedor criarFornecedor(@RequestBody FornecedorDTO fornecedor) {
        return fornecedorService.criarFornecedor(fornecedor);
    }

    @GetMapping
    public List<Fornecedor> pegarTodosFornecedores() {
        return fornecedorService.pegarTodosFornecedores();
    }
}
