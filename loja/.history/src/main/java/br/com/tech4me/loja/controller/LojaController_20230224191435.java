package br.com.tech4me.loja.controller;

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


import br.com.tech4me.loja.service.LojaService;
import br.com.tech4me.loja.shared.LojaCompletoDto;
import br.com.tech4me.loja.shared.LojaDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/compras")
public class LojaController {
    
    @Autowired
    private LojaService servico;
    


    //Cadastrar pedido
    @PostMapping
    public ResponseEntity<LojaCompletoDto> CadastrarCompra(@RequestBody @Valid LojaCompletoDto compra)
    {
        try {
            return new ResponseEntity<>(servico.CadastrarCompra(compra), HttpStatus.CREATED);
        } catch (SkinJaCadastradaException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (FeignException e) {
            return new ResponseEntity<>(e.contentUTF8(), HttpStatus.valueOf(e.status()));
        }
        
    }

    //Buscar Pedidos
    @GetMapping
    public ResponseEntity<List<LojaCompletoDto>> obterCompras()
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
    public ResponseEntity<Void> CancelarCompra(@PathVariable String id)
    {
        servico.CancelarCompra(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //Atualizar pedido
    @PutMapping("/{id}")
    public ResponseEntity<LojaCompletoDto> atualizarCompraPorId(@PathVariable String id,@RequestBody @Valid LojaCompletoDto compra){
        Optional<LojaCompletoDto> retorno = servico.atualizarCompraPorId(id, compra);

        if(retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(),HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
