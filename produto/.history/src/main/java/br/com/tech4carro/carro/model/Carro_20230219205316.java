package br.com.tech4carro.carro.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Carro {
  @Id
  @GenerateVal
  private long id;
  private String nomeCarro;
  private String marca;
  private String placa;
  private String cor;

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getNomeCarro() {
    return nomeCarro;
  }
  public void setNomeCarro(String nomeCarro) {
    this.nomeCarro = nomeCarro;
  }
  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getPlaca() {
    return placa;
  }
  public void setPlaca(String placa) {
    this.placa = placa;
  }
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
}
