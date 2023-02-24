package br.com.tech4Skin.produtos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4Skin.produtos.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
  
}
