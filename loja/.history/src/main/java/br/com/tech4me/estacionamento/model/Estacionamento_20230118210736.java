package br.com.tech4me.estacionamento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("estacionamento")
public class Estacionamento {
    @Id
    private String id;
    private String bloco;
    private String idCarro;
    private String placa;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

   

}
