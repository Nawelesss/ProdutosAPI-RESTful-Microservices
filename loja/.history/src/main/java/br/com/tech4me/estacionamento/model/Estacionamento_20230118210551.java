package br.com.tech4me.estacionamento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("estacionamento")
public class Estacionamento {
    @Id
    private String id;
    private String bloco;
    private String idCarro;
    private Double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}
