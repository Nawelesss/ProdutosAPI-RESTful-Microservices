package br.com.tech4me.loja.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.loja.httpClient.ProdutoClient;
import br.com.tech4me.loja.model.Loja;
import br.com.tech4me.loja.repository.LojaRepository;
import br.com.tech4me.loja.shared.LojaDto;
import br.com.tech4me.loja.shared.LojaoCompletoDto;

@Service
public class LojaServiceImp implements LojaService{


    @Autowired
    private LojaRepository repository;
    
    @Autowired
    private ProdutoClient compraClient;

    @Override
    public List<LojaoCompletoDto> obterCompras() {
        List<Loja> compras = repository.findAll();
        List<LojaoCompletoDto> dto = compras.stream().map(e -> new ModelMapper().map(e, LojaoCompletoDto.class)).collect(Collectors.toList());
        return dto;
    }

    @Override
    public Optional<LojaDto> obterCompraPorId(String id) {
        
        Optional<Loja> comprado = repository.findById(id);
        if(comprado.isPresent()){
            LojaDto Itemcomprado = new ModelMapper().map(comprado, LojaDto.class);
            Itemcomprado.setDadosCarro(compraClient.obterSkin(Itemcomprado.getIdSkin()));
            return Optional.of(Itemcomprado);
        }else{
            return Optional.empty();
        }
    }

    @Override
    public void CancelarCompra(String id) {
        repository.deleteById(id);
    }

    @Override
    public LojaoCompletoDto CadastrarCompra(LojaoCompletoDto dto) {
        Loja comprado = new ModelMapper().map(dto, Loja.class);

        repository.save(comprado);
        return new ModelMapper().map(comprado,LojaoCompletoDto.class);
    }

    @Override
    public Optional<LojaDto> atualizarCompraPorId(String id, LojaDto dto) {
        Optional<Loja> retorno = repository.findById(id);

        if(retorno.isPresent()){
            Loja compradoRetorno = new ModelMapper().map(dto, Loja.class);
            compradoRetorno.setId(id);
            repository.save(compradoRetorno);
            return Optional.of(new ModelMapper().map(compradoRetorno, LojaDto.class));
        }else{
            return Optional.empty();
        }
    }   
}
