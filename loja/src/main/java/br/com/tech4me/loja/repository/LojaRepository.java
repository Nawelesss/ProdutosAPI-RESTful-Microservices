package br.com.tech4me.loja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.loja.model.Loja;

public interface LojaRepository extends MongoRepository<Loja,String>{
    
}
