package com.fiec.estoqueia.business.repositories;

import com.fiec.estoqueia.business.entities.Fornecedor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends MongoRepository<Fornecedor, ObjectId> {
}