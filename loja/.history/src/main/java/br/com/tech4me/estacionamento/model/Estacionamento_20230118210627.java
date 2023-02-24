package br.com.tech4me.estacionamento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("estacionamento")
public class Estacionamento {
    @Id
    private String id;
    private String bloco;
    private String idCarro;
    private String placa;

   

}
