package br.com.tech4me.estacionamento.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.estacionamento.httpClient.ProdutoClient;
import br.com.tech4me.estacionamento.model.Loja;
import br.com.tech4me.estacionamento.repository.LojaRepository;
import br.com.tech4me.estacionamento.shared.LojaoCompletoDto;
import br.com.tech4me.estacionamento.shared.LojaDto;

@Service
public class LojaServiceImp implements LojaService{


    @Autowired
    private LojaRepository repository;
    
    @Autowired
    private ProdutoClient CarroriaClient;

    @Override
    public List<LojaoCompletoDto> obterCompras() {
        List<Loja> compras = repository.findAll();
        List<LojaoCompletoDto> dto = compras.stream().map(e -> new ModelMapper().map(e, LojaoCompletoDto.class)).collect(Collectors.toList());
        return dto;
    }

    @Override
    public Optional<LojaDto> obterCompraPorId(String id) {
        
        Optional<Loja> compra = repository.findById(id);
        if(compra.isPresent()){
            LojaDto compraComCarro = new ModelMapper().map(compra, LojaDto.class);
            compraComCarro.setDadosCarro(CarroriaClient.obterCarro(compraItem.getIdCarro()));
            return Optional.of(compraItem);
        }else{
            return Optional.empty();
        }
    }

    @Override
    public void removerCarro(String id) {
        repository.deleteById(id);
    }

    @Override
    public LojaoCompletoDto CadastrarCarro(LojaoCompletoDto dto) {
        Loja compra = new ModelMapper().map(dto, Loja.class);

        repository.save(compra);
        return new ModelMapper().map(compra,LojaoCompletoDto.class);
    }

    @Override
    public Optional<LojaDto> atualizarCarroPorId(String id, LojaDto dto) {
        Optional<Loja> retorno = repository.findById(id);

        if(retorno.isPresent()){
            Loja compraRetorno = new ModelMapper().map(dto, Loja.class);
            compraRetorno.setId(id);
            repository.save(compraRetorno);
            return Optional.of(new ModelMapper().map(compraRetorno, LojaDto.class));
        }else{
            return Optional.empty();
        }
    }   
}
