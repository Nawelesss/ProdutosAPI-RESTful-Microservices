package br.com.tech4me.estacionamento.shared;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class EstacionamentoCompletoDto {
    private String id;
    @Size(max=3,message = "informe o bloco correto!")
    private String bloco;
    private String idCarro;
    @Size(min=7,max=7,message = "A placa do carro deve ter 7 caracteres!")
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
