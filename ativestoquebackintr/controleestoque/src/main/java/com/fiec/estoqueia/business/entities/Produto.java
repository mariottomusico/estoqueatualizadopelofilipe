package com.fiec.estoqueia.business.entities;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Document(collection = "produtos")
public class Produto {
    @Id
    private ObjectId id;
    private String nome;
    private String descricao;
    private Date validade;
    private String imagem;
    private Map<String, Object> atributos;
    private ObjectId fornecedorId;
    private ObjectId categoriaId;

    // Getters e Setters
}