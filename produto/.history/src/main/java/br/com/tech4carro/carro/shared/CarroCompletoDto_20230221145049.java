package br.com.tech4carro.carro.shared;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class CarroCompletoDto {
    private String id;
    private int codigo;
    private String nome;
    private double valor;
    private int quantidadeEstoque;

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
