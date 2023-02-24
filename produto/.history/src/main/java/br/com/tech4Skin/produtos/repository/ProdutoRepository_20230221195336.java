package br.com.tech4carro.produtos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4carro.produtos.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
  
}
