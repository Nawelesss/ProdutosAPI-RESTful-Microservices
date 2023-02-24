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

    
}
