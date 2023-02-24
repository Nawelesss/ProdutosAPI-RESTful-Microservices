package br.com.tech4me.loja.shared;

import br.com.tech4me.loja.model.Produto;

public class LojaDto {
   
    private String nomeComprador;
    private String idSkin;
    private Produto dadosproduto;

    

    public String getNomeComprador() {
        return nomeComprador;
    }
    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }
    public String getIdSkin() {
        return idSkin;
    }
    public void setIdSkin(String idSkin) {
        this.idSkin = idSkin;
    }

    
    
    
    
    
}
