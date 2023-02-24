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
import br.com.tech4me.estacionamento.shared.EstacionamentoDto;

@Service
public class LojaServiceImp implements LojaService{


    @Autowired
    private LojaRepository repository;
    
    @Autowired
    private ProdutoClient CarroriaClient;

    @Override
    public List<LojaoCompletoDto> obterEstacionados() {
        List<Loja> estacionados = repository.findAll();
        List<LojaoCompletoDto> dto = estacionados.stream().map(e -> new ModelMapper().map(e, LojaoCompletoDto.class)).collect(Collectors.toList());
        return dto;
    }

    @Override
    public Optional<EstacionamentoDto> obterEstacionadoPorId(String id) {
        
        Optional<Loja> estacionado = repository.findById(id);
        if(estacionado.isPresent()){
            EstacionamentoDto estacionadoComCarro = new ModelMapper().map(estacionado, EstacionamentoDto.class);
            estacionadoComCarro.setDadosCarro(CarroriaClient.obterCarro(estacionadoComCarro.getIdCarro()));
            return Optional.of(estacionadoComCarro);
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
        Loja estacionado = new ModelMapper().map(dto, Loja.class);

        repository.save(estacionado);
        return new ModelMapper().map(estacionado,LojaoCompletoDto.class);
    }

    @Override
    public Optional<EstacionamentoDto> atualizarCarroPorId(String id, EstacionamentoDto dto) {
        Optional<Loja> retorno = repository.findById(id);

        if(retorno.isPresent()){
            Loja estacionadoRetorno = new ModelMapper().map(dto, Loja.class);
            estacionadoRetorno.setId(id);
            repository.save(estacionadoRetorno);
            return Optional.of(new ModelMapper().map(estacionadoRetorno, EstacionamentoDto.class));
        }else{
            return Optional.empty();
        }
    }   
}
