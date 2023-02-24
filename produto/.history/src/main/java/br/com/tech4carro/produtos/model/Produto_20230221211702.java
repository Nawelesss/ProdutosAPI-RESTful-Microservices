package br.com.tech4carro.produtos.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto{
    @Id
    private String id;
    private String nome;
    private double valor;
    private double f;
    private boolean vendido;
    

    
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
