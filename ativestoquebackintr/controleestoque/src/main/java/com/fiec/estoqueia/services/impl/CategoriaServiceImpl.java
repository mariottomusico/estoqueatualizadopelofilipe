package com.fiec.estoqueia.services.impl;

import com.fiec.estoqueia.business.dtos.CategoriaDTO;
import com.fiec.estoqueia.business.entities.Categoria;
import com.fiec.estoqueia.business.repositories.CategoriaRepository;
import com.fiec.estoqueia.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria criarCategoria(CategoriaDTO categoria) {
        Categoria categoriaNova = new Categoria();
        categoriaNova.setTipo(categoria.getTipo());
        categoriaNova.setNome(categoria.getNome());
        return categoriaRepository.save(categoriaNova);
    }

    @Override
    public List<Categoria> pegarTodasCategorias() {
        return categoriaRepository.findAll();
    }

    // Outros métodos da interface CategoriaService
}