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

  public void setId(String id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public boolean isCompleto() {
    return completo;
  }

  public void setCompleto(boolean completo) {
    this.completo = completo;
  }
 

  
}
