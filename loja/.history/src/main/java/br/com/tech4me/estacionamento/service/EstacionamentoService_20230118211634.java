package br.com.tech4me.estacionamento.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.estacionamento.shared.EstacionamentoCompletoDto;
import br.com.tech4me.estacionamento.shared.EstacionamentoDto;

public interface EstacionamentoService {
    
    List<EstacionamentoCompletoDto> obterPedidos();
    Optional<EstacionamentoDto> obterPedidoPorId(String id);
    void excluirPedido(String id);
    EstacionamentoCompletoDto CadastrarPedido(EstacionamentoCompletoDto pedido);
    Optional<EstacionamentoDto> atualizarPedidoPorId(String id, EstacionamentoDto dto);

}
