package br.com.tech4carro.carro.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4carro.carro.shared.ProdutoCompletoDto;
import br.com.tech4carro.carro.shared.ProdutoDto;


public interface ProdutoService {
  List<ProdutoCompletoDto> obterTodos();
  Optional<ProdutoDto> obterPorId(String id);
  void excluirPorId(String id);
  ProdutoCompletoDto cadastrar(ProdutoCompletoDto dto);
  Optional<ProdutoCompletoDto> atualizarPorId(String id, ProdutoCompletoDto dto);
}
