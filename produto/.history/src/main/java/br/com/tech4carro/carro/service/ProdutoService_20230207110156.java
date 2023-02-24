package br.com.tech4carro.carro.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4carro.carro.shared.CarroCompletoDto;
import br.com.tech4carro.carro.shared.CarroDto;


public interface CarroService {
  List<CarroCompletoDto> obterTodos();
  Optional<CarroDto> obterPorId(String id);
  void excluirPorId(String id);
  CarroCompletoDto cadastrar(CarroCompletoDto dto);
  Optional<CarroCompletoDto> atualizarPorId(String id, CarroCompletoDto dto);
}
