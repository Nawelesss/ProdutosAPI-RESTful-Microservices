package br.com.tech4me.estacionamento.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.estacionamento.shared.LojaoCompletoDto;
import br.com.tech4me.estacionamento.shared.LojaDto;

public interface LojaService {
    
    List<LojaoCompletoDto> obterEstacionados();
    Optional<LojaDto> obterCompraPorId(String id);
    void CancelarCompra(String id);
    LojaoCompletoDto CadastrarCompra(LojaoCompletoDto Estacionado);
    Optional<LojaDto> atualizarCompraPorId(String id, LojaDto dto);

}
