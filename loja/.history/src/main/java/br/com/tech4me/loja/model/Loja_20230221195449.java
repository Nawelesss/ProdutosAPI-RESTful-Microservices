package br.com.tech4me.loja.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("comprados")
public class Loja {
    @Id
    private String id;
    private String nomeComprador;
    private String idSkin;

    
   

}
