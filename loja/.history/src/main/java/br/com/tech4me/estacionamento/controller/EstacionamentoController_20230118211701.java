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

import br.com.tech4me.estacionamento.service.EstacionamentoService;
import br.com.tech4me.estacionamento.shared.EstacionamentoCompletoDto;
import br.com.tech4me.estacionamento.shared.EstacionamentoDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Estacionamento")
public class EstacionamentoController {
    
    @Autowired
    private EstacionamentoService servico;

    //Cadastrar pedido
    @PostMapping
    public ResponseEntity<EstacionamentoCompletoDto> cadastrarCarro(@RequestBody @Valid EstacionamentoCompletoDto pedido)
    {
        return new ResponseEntity<>(servico.CadastrarPedido(pedido),HttpStatus.CREATED);
    }

    //Buscar Pedidos
    @GetMapping
    public ResponseEntity<List<EstacionamentoCompletoDto>> obterPedidos()
    {
        return new ResponseEntity<>(servico.obterEstacionados(),HttpStatus.OK);
    } 

    //Buscar pedido por id
    @GetMapping("/{id}")
    public ResponseEntity<EstacionamentoDto> obterPedidoPorId(@PathVariable String id)
    {
        Optional<EstacionamentoDto> retorno = servico.obterPedidoPorId(id);
        
        if(retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }    
    }

    //Deletar Pedido
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPedido(@PathVariable String id)
    {
        servico.excluirPedido(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //Atualizar pedido
    @PutMapping("/{id}")
    public ResponseEntity<EstacionamentoDto> atualizarPedido(@PathVariable String id, @Valid EstacionamentoDto pedido){
        Optional<EstacionamentoDto> retorno = servico.atualizarPedidoPorId(id, pedido);

        if(retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(),HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
