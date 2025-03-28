package com.fiec.estoqueia.controllers;

import com.fiec.estoqueia.business.dtos.CategoriaDTO;
import com.fiec.estoqueia.business.entities.Categoria;
import com.fiec.estoqueia.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categoria criarCategoria(@RequestBody CategoriaDTO categoria) {
        return categoriaService.criarCategoria(categoria);
    }

    @GetMapping
    public List<Categoria> pegarTodasCategorias() {
        return categoriaService.pegarTodasCategorias();
    }
}
