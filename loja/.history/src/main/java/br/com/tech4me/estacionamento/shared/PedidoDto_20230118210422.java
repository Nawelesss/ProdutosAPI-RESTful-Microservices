package br.com.tech4me.estoque.shared;

import br.com.tech4me.estoque.model.Carro;

public class PedidoDto {
    private String nomeCliente;
    private String idPizza;
    private Carro dadosPizza;
    private Double valor;
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdPizza() {
        return idPizza;
    }
    public void setIdPizza(String idPizza) {
        this.idPizza = idPizza;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Carro getDadosPizza() {
        return dadosPizza;
    }
    public void setDadosPizza(Carro dadosPizza) {
        this.dadosPizza = dadosPizza;
    }
    
}
