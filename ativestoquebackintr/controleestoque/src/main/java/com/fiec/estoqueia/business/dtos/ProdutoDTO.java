package com.fiec.estoqueia.business.dtos;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.Map;

@Data
public class ProdutoDTO {
    private String nome;
    private String descricao;
    private Date validade;
    private String imagem;
    private Map<String, Object> atributos;
    private ObjectId fornecedorId;
    private ObjectId categoriaId;

    // Getters e Setters
}
