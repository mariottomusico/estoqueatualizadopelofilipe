package com.fiec.estoqueia.business.repositories;

import com.fiec.estoqueia.business.entities.Produtos;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProdutoRepository extends MongoRepository<Produtos, ObjectId> {
    //Set<Produtos> findByProdutosByName(String name);
}