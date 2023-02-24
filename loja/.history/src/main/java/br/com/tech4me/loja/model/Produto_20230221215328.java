package br.com.tech4me.loja.model;




public class Produto {
    private String nome;
    private double valor;
    private double f;
    private boolean vendido=false;
    
    

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
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    public boolean isVendido() {
        return vendido;
    }


  

  
}
