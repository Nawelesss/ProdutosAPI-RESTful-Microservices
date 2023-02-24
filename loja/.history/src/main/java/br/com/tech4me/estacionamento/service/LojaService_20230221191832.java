package br.com.tech4me.estacionamento.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.estacionamento.shared.LojaoCompletoDto;
import br.com.tech4me.estacionamento.shared.EstacionamentoDto;

public interface LojaService {
    
    List<LojaoCompletoDto> obterEstacionados();
    Optional<EstacionamentoDto> obterEstacionadoPorId(String id);
    void removerCarro(String id);
    LojaoCompletoDto CadastrarCarro(LojaoCompletoDto Estacionado);
    Optional<EstacionamentoDto> atualizarCarroPorId(String id, EstacionamentoDto dto);

}
