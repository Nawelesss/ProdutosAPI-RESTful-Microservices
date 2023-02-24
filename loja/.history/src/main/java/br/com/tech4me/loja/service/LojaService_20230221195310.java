package br.com.tech4me.loja.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.loja.shared.LojaDto;
import br.com.tech4me.loja.shared.LojaoCompletoDto;

public interface LojaService {
    
    List<LojaoCompletoDto> obterCompras();
    Optional<LojaDto> obterCompraPorId(String id);
    void CancelarCompra(String id);
    LojaoCompletoDto CadastrarCompra(LojaoCompletoDto Comprado);
    Optional<LojaDto> atualizarCompraPorId(String id, LojaDto dto);

}
