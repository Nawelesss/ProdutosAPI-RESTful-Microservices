package br.com.tech4me.estacionamento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("comprados")
public class Loja {
    @Id
    private String id;
    private String nomeComprador;
    private String id

   

}
