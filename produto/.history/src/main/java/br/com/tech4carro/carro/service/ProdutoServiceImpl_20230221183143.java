package br.com.tech4carro.carro.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4carro.carro.model.Produto;
import br.com.tech4carro.carro.repository.ProdutoRepository;
import br.com.tech4carro.carro.shared.ProdutoCompletoDto;
import br.com.tech4carro.carro.shared.ProdutoDto;

@Service
public class ProdutoServiceImpl implements ProdutoService {
  @Autowired
  private ProdutoRepository repositorio;

  @Override
  public List<ProdutoCompletoDto> obterTodos() {
    List<Produto> carros = repositorio.findAll();
    
    return carros.stream()
                .map(c -> new ModelMapper().map(c, ProdutoCompletoDto.class))
                .collect(Collectors.toList());
  }

  @Override
  public Optional<ProdutoDto> obterPorId(String id) {
    Optional<Produto> carro  = repositorio.findById(id);

    if (carro.isPresent()) {
      return Optional.of(new ModelMapper().map(carro.get(), ProdutoDto.class));
    }
    return Optional.empty();
  }

  @Override
  public void excluirPorId(String id) {
    repositorio.deleteById(id);
  }

  @Override
  public ProdutoCompletoDto cadastrar(ProdutoCompletoDto dto) {
    Produto carro = new ModelMapper().map(dto, Produto.class);
    repositorio.save(carro);
    return new ModelMapper().map(carro, ProdutoCompletoDto.class);  
  }

  @Override
  public Optional<ProdutoCompletoDto> atualizarPorId(String id, ProdutoCompletoDto dto) { 
    Optional<Produto> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      Produto carro = new ModelMapper().map(dto, Produto.class);
      carro.setId(id);
      repositorio.save(carro);
      return Optional.of(new ModelMapper().map(carro, ProdutoCompletoDto.class));
    } else {
      return Optional.empty();
    }
    
   
  }
  
}
