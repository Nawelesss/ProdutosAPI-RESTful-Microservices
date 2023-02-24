package br.com.tech4me.estacionamento.shared;

import br.com.tech4me.estacionamento.model.Produto;

public class EstacionamentoDto {
    private String bloco;
    private String nomeDono;
    private String idCarro;
    private Produto dadosCarro;
    private String placa;

    
    public String getBloco() {
        return bloco;
    }
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
    public String getIdCarro() {
        return idCarro;
    }
    public void setIdCarro(String idCarro) {
        this.idCarro = idCarro;
    }
    public Produto getDadosCarro() {
        return dadosCarro;
    }
    public void setDadosCarro(Produto dadosCarro) {
        this.dadosCarro = dadosCarro;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    
    
    
}
