package br.com.tech4me.loja.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Loja {
    @Id
    private String id;
    private String nomeComprador;
    private String idSkin;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
