package br.com.tech4me.estacionamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.estacionamento.service.LojaService;
import br.com.tech4me.estacionamento.shared.LojaoCompletoDto;
import br.com.tech4me.estacionamento.shared.LojaDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Estacionamento")
public class LojaController {
    
    @Autowired
    private LojaService servico;

    //Cadastrar pedido
    @PostMapping
    public ResponseEntity<LojaoCompletoDto> cadastrarLoja(@RequestBody @Valid LojaoCompletoDto estacionamento)
    {
        return new ResponseEntity<>(servico.CadastrarLoja(estacionamento),HttpStatus.CREATED);
    }

    //Buscar Pedidos
    @GetMapping
    public ResponseEntity<List<LojaoCompletoDto>> obterCompras()
    {
        return new ResponseEntity<>(servico.obterCompras(),HttpStatus.OK);
    } 

    //Buscar pedido por id
    @GetMapping("/{id}")
    public ResponseEntity<LojaDto> obterCompraPorId(@PathVariable String id)
    {
        Optional<LojaDto> retorno = servico.obterCompraPorId(id);
        
        if(retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }    
    }

    //Deletar Pedido
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> foraDoEstacionamento(@PathVariable String id)
    {
        servico.(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //Atualizar pedido
    @PutMapping("/{id}")
    public ResponseEntity<LojaDto> atualizarEstacionado(@PathVariable String id, @Valid LojaDto estacionamento){
        Optional<LojaDto> retorno = servico.atualizarLojaPorId(id, estacionamento);

        if(retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(),HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
