package br.com.tech4me.estoque.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.estoque.model.Pedido;

public interface PedidoRepository extends MongoRepository<Pedido,String>{
    
}
