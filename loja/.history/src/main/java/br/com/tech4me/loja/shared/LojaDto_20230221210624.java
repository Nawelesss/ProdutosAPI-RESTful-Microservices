package br.com.tech4me.loja.shared;

import br.com.tech4me.loja.model.Produto;
import import br.com.tech4me.loja.shared.Loja;
public class LojaDto {
   
    private String nomeComprador;
    private String idSkin;
    private Produto dadosproduto;
    private String compra=itemcomprado;

    

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
    public Produto getDadosproduto() {
        return dadosproduto;
    }
    public void setDadosproduto(Produto dadosproduto) {
        this.dadosproduto = dadosproduto;
    }

    
    
    
    
    
}
