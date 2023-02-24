package br.com.tech4Skin.produtos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4Skin.produtos.model.Produto;
import br.com.tech4Skin.produtos.repository.ProdutoRepository;
import br.com.tech4Skin.produtos.shared.ProdutoCompletoDto;
import br.com.tech4Skin.produtos.shared.ProdutoDto;

@Service
public class ProdutoServiceImpl implements ProdutoService{
    @Autowired
    private ProdutoRepository repositorio;
    @Override
    public ProdutoCompletoDto criarProduto(ProdutoCompletoDto dto){
        Produto produto = new ModelMapper().map(dto, Produto.class);
        repositorio.save(produto);
        return new ModelMapper().map(produto, ProdutoCompletoDto.class);  
    }
    @Override
    public List<ProdutoCompletoDto> obterTodos(){
        List<Produto> produtos = repositorio.findAll();
        return produtos.stream()
        .map(p -> new ModelMapper().map(p, ProdutoCompletoDto.class))
                .collect(Collectors.toList());
    }
    @Override
    public Optional<ProdutoDto> obterPorId(String id){
        Optional<Produto> produto  = repositorio.findById(id);

    if (produto.isPresent()) {
      return Optional.of(new ModelMapper().map(produto.get(), ProdutoDto.class));
    }
    return Optional.empty();
    }
    @Override
    public void removerProdutoPorId(String id){
        repositorio.deleteById(id);
    }
    @Override
    public void atualizarVendido(String id,Boolean vendido) {
      Optional<Produto> produtoOptional = repositorio.findById(id);
      if (produtoOptional.isPresent()) {
          Produto produto = produtoOptional.get();
          produto.setVendido(vendido);
          repositorio.save(produto);
      } else {
        try{
          throw new RuntimeException("Produto não encontrado");
        }
          
        
    }
      
    

    @Override
    public Optional<ProdutoCompletoDto> atualizarProdutoPorId(String id, ProdutoCompletoDto dto){
        Optional<Produto> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      Produto produto = new ModelMapper().map(dto, Produto.class);
      produto.setId(id);
      repositorio.save(produto);
      return Optional.of(new ModelMapper().map(produto, ProdutoCompletoDto.class));
    } else {
      return Optional.empty();
    }
    }
    
}