package br.com.tech4carro.produtos.shared;


public class ProdutoDto {
  private String id;
  private String nome;
  private double valor;
  private double f;
  private boolean vendido;


  
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
 
  public String getId() {
      return id;
  }
  public void setId(String id) {
      this.id = id;
  }
public double getF() {
    return f;
}
public void setF(double f) {
    this.f = f;
}
public boolean isVendido() {
    return vendido;
}
public void setVendido(boolean vendido) {
    this.vendido = vendido;
}
  
}
