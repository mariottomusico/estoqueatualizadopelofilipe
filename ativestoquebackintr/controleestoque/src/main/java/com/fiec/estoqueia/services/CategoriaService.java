package com.fiec.estoqueia.services;


import com.fiec.estoqueia.business.dtos.CategoriaDTO;
import com.fiec.estoqueia.business.entities.Categoria;
import com.fiec.estoqueia.business.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


public interface CategoriaService {



    public Categoria criarCategoria(CategoriaDTO categoria);



    public List<Categoria> pegarTodasCategorias();


}
