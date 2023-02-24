package br.com.tech4Skin.produtos.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4Skin.produtos.service.ProdutoService;
import br.com.tech4Skin.produtos.shared.ProdutoCompletoDto;
import br.com.tech4Skin.produtos.shared.ProdutoDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ProdutoController {
    @Autowired
    private ProdutoService servico;

    @PostMapping
    public ResponseEntity<ProdutoCompletoDto> cadastrar(@RequestBody @Valid ProdutoCompletoDto produto) {
        return new ResponseEntity<>(servico.criarProduto(produto), HttpStatus.CREATED); 
    }

    @GetMapping
    public ResponseEntity<List<ProdutoCompletoDto>> obterProdutos(){
        return new ResponseEntity<>(servico.obterTodos(), HttpStatus.OK);
    }
    
   //public Produto criarProduto(@RequestBody Produto produto){
     //   return servico.criarProduto(produto);
    //}
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDto> obterProduto(@PathVariable String id){
        Optional<ProdutoDto> retorno = servico.obterPorId(id);

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }
   // @DeleteMapping(value="/{id}")
   // public void removerProduto(@PathVariable String id){
    //    servico.removerProduto(id);
   // }
    @PutMapping(value="/{id}")
    public ResponseEntity<ProdutoCompletoDto> atualizarProduto(@PathVariable String id,@RequestBody @Valid ProdutoCompletoDto produto){
        Optional<ProdutoCompletoDto> retorno = servico.atualizarProdutoPorId(id, produto); 

        if (retorno.isPresent()) {
          return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
        } else {
          return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
   /* @PutMapping
    public ResponseEntity<ProdutoCompletoDto> atualizarBooleana(@PathVariable String id,@RequestBody @Valid 
    ProdutoCompletoDto dto ,Boolean vendido){
      Optional<ProdutoCompletoDto> retorno = servico.atualizarBooleana(id, dto,vendido);
      if (retorno.isPresent()){
        return new ResponseEntity<>(retorno.get(),(HttpStatus.ACCEPTED));
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
      }
    } */
    @PutMapping("/{id}/vendido")
    public ResponseEntity<Void> atualizarVendido(@PathVariable String id,@RequestParam Boolean vendido){
      Optional<ProdutoCOmpletoDto> retorno = servico.atualizarVendido(id, vendido);
      servico.atualizarVendido(id, vendido);
      return ResponseEntity.ok().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerProdutoPorId(@PathVariable String id){
        servico.removerProdutoPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
