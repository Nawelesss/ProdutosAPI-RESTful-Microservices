package br.com.tech4me.estacionamento.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.estacionamento.shared.PedidoCompletoDto;
import br.com.tech4me.estacionamento.shared.EstacionamentoDto;

public interface EstacionamentoService {
    
    List<PedidoCompletoDto> obterPedidos();
    Optional<EstacionamentoDto> obterPedidoPorId(String id);
    void excluirPedido(String id);
    PedidoCompletoDto CadastrarPedido(PedidoCompletoDto pedido);
    Optional<EstacionamentoDto> atualizarPedidoPorId(String id, EstacionamentoDto dto);

}
