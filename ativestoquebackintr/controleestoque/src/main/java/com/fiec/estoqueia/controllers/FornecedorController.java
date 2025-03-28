package com.fiec.estoqueia.controllers;

import com.fiec.estoqueia.business.dtos.CreateCategoriaDto;
import com.fiec.estoqueia.business.dtos.CreateFornecedorDto;
import com.fiec.estoqueia.business.entities.Categorias;
import com.fiec.estoqueia.business.entities.Fornecedores;
import com.fiec.estoqueia.services.CategoriaService;
import com.fiec.estoqueia.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<Fornecedores> createFornecedor(@RequestBody CreateFornecedorDto createFornecedorDto) {
        Fornecedores fornecedor = fornecedorService.createFornecedores(createFornecedorDto);
        return ResponseEntity.ok(fornecedor);
    }

    @GetMapping
    public ResponseEntity<List<Fornecedores>> listaFornecedores() {
        List<Fornecedores> fornecedores = fornecedorService.listaFornecedores();
        return ResponseEntity.ok(fornecedores);
    }
}

