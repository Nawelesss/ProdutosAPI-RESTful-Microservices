package br.com.tech4carro.produtos.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4carro.produtos.shared.ProdutoCompletoDto;
import br.com.tech4carro.produtos.shared.ProdutoDto;


public interface ProdutoService {
  ProdutoCompletoDto criarProduto(ProdutoCompletoDto dto);
  List<ProdutoCompletoDto> obterTodos();
  Optional<ProdutoDto> obterPorId(String id);
  void removerProdutoPorId(String id);
  Optional<ProdutoCompletoDto> atualizarProdutoPorId(String id,ProdutoCompletoDto dto);
  Optional<ProdutoCompletoDto> atualizarVendido(Boolean vendido,String id);
}
