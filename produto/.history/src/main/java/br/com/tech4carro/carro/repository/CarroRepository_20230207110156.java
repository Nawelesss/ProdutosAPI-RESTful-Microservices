package br.com.tech4carro.carro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4carro.carro.model.Carro;

public interface CarroRepository extends MongoRepository<Carro, String> {
  
}
