package br.com.tech4carro.carro.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Carro {
  @Id
  
  private String id;
  private String descricao;
  private boolean completo;

  public String getId() {
    return id;
  }
 

  
}
