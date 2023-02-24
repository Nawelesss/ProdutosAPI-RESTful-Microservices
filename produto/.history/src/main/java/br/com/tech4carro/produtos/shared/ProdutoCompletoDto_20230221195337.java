package br.com.tech4carro.produtos.shared;

import jakarta.validation.constraints.Positive;

import jakarta.validation.constraints.NotEmpty;


public class ProdutoCompletoDto {
  private String id;
  @NotEmpty(message="O campo nome deve ser informado.")
  private String nome; 
  @Positive(message="No campo valor é necessário digitar um valor possitivo.")
  private double valor;
  private double f;
  

  public String getId() {
      return id;
  }
  public void setId(String id) {
      this.id = id;
  }
  public String getNome() {
      return nome;
  }
  public void setNome(String nome) {
      this.nome = nome;
  }
  public double getValor() {
      return valor;
  }
  public void setValor(double valor) {
      this.valor = valor;
  }
  
public double getF() {
    return f;
}
public void setF(double f) {
    this.f = f;
}

 

  
}
