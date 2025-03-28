package com.fiec.estoqueia.business.entities;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "fornecedores")
public class Fornecedor {
    @Id
    private ObjectId id;
    private String nome;
    private String cnpj;

    // Getters e Setters
}