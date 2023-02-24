package br.com.tech4me.estacionamento.shared;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class EstacionamentoCompletoDto {
    private String id;
    @Size(max=3,message = "informe o bloco correto!")
    private String bloco;
    private String idCarro;
    @Size(min)
    private String placa;

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
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
