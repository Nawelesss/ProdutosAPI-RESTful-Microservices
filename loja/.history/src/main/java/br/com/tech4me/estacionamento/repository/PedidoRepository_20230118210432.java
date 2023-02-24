package br.com.tech4me.estacionamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.estacionamento.model.Pedido;

public interface PedidoRepository extends MongoRepository<Pedido,String>{
    
}
