package br.com.tech4carro.carro.shared;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CarroCompletoDto {
  private String id;
  @NotEmpty(message="Campo nomeCarro deve ser informado")
  @NotBlank(message="Tem que informar os caracteres")
  private String nomeCarro;
  private String marca;
  @Size(min=7, max=7, message="A placa do carro deve ter 7 caracteres!")
  private String placa;
  @Not(message="A cor do carro deve ser informada!")
  private Double cor;

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
  public Double getCor() {
    return cor;
  }
  public void setCor(Double cor) {
    this.cor = cor;
  }
  
 
 
}
