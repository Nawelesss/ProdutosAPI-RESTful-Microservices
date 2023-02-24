package br.com.tech4me.estacionamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.estacionamento.model.Loja;

public interface LojaRepository extends MongoRepository<Loja,String>{
    
}
