package br.com.tech4me.estacionamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.estacionamento.model.Loja;

public interface EstacionamentoRepository extends MongoRepository<Loja,String>{
    
}
