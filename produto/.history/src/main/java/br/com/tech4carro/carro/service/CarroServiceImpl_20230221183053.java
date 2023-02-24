package br.com.tech4carro.carro.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4carro.carro.model.Produto;
import br.com.tech4carro.carro.repository.CarroRepository;
import br.com.tech4carro.carro.shared.CarroCompletoDto;
import br.com.tech4carro.carro.shared.CarroDto;

@Service
public class CarroServiceImpl implements CarroService {
  @Autowired
  private CarroRepository repositorio;

  @Override
  public List<CarroCompletoDto> obterTodos() {
    List<Produto> carros = repositorio.findAll();
    
    return carros.stream()
                .map(c -> new ModelMapper().map(c, CarroCompletoDto.class))
                .collect(Collectors.toList());
  }

  @Override
  public Optional<CarroDto> obterPorId(String id) {
    Optional<Produto> carro  = repositorio.findById(id);

    if (carro.isPresent()) {
      return Optional.of(new ModelMapper().map(carro.get(), CarroDto.class));
    }
    return Optional.empty();
  }

  @Override
  public void excluirPorId(String id) {
    repositorio.deleteById(id);
  }

  @Override
  public CarroCompletoDto cadastrar(CarroCompletoDto dto) {
    Produto carro = new ModelMapper().map(dto, Produto.class);
    repositorio.save(carro);
    return new ModelMapper().map(carro, CarroCompletoDto.class);  
  }

  @Override
  public Optional<CarroCompletoDto> atualizarPorId(String id, CarroCompletoDto dto) { 
    Optional<Produto> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      Produto carro = new ModelMapper().map(dto, Produto.class);
      carro.setId(id);
      repositorio.save(carro);
      return Optional.of(new ModelMapper().map(carro, CarroCompletoDto.class));
    } else {
      return Optional.empty();
    }
    
   
  }
  
}
