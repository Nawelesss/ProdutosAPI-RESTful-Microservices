package br.com.tech4me.loja.shared;

import br.com.tech4me.loja.model.Produto;

public class LojaDto {
    private String id;
    private String nomeComprador;
    private String idSkin;

    
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
