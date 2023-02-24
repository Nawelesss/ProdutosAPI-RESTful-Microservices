package br.com.tech4carro.carro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4carro.carro.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
  
}
