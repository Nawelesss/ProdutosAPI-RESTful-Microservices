package br.com.tech4carro.carro.shared;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProdutoCompletoDto {
  private String id;
  @NotEmpty(message="O campo nome deve ser informado.")
  private String nome; 
  @Positive(message="No campo valor é necessário digitar um valor possitivo.")
  private double valor;
  private int quantidadeEstoque;
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
  public int getQuantidadeEstoque() {
      return quantidadeEstoque;
  }
  public void setQuantidadeEstoque(int quantidadeEstoque) {
      this.quantidadeEstoque = quantidadeEstoque;
  }

 

  
}
