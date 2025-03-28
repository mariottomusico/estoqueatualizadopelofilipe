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
public class Produtos {
    @Id
    private ObjectId id;
    private String nome;
    private String descricao;
    @Field("codigo_barra")
    private String codigoBarra;
    private ObjectId categoria;
    @Field("categoria_name")
    private String categoriaName;
    @Field("preco_custo")
    private Double precoCusto;
    @Field("preco_venda")
    private Double precoVenda;
    @Field("unidade_medida")
    private String unidadeMedida;
    private ObjectId fornecedor;
    @Field("fornecedor_name")
    private String fornecedorName;
    private List<String> imagens;
    private Boolean ativo;
    @CreatedDate
    @Field("data_cadastro")
    private Date dataCadastro;
    @LastModifiedDate
    @Field("data_atualizacao")
    private Date dataAtualizacao;
    private Map<String, Object> atributos; // Atributos genéricos
}