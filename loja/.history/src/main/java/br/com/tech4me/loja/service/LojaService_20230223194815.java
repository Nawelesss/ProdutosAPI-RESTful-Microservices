package br.com.tech4me.loja.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.loja.shared.LojaDto;
import br.com.tech4me.loja.shared.LojaCompletoDto;

public interface LojaService {
    
    List<LojaCompletoDto> obterCompras();
    Optional<LojaDto> obterCompraPorId(String id);
    void CancelarCompra(String id);
    LojaCompletoDto CadastrarCompra(LojaCompletoDto Comprado);
    Optional<LojaCompletoDto> atualizarCompraPorId(String id, LojaCompletoDto dto);
    void atualizarBooleana
}
