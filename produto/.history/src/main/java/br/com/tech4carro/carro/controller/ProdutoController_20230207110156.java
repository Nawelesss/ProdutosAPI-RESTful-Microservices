package br.com.tech4carro.carro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

import br.com.tech4carro.carro.service.CarroService;
import br.com.tech4carro.carro.shared.CarroCompletoDto;
import br.com.tech4carro.carro.shared.CarroDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/estoque")
public class CarroController {
  @Autowired
  private CarroService servico;
  

  @PostMapping
  public ResponseEntity<CarroCompletoDto> cadastrarCarro(@RequestBody @Valid CarroCompletoDto Carro){
    return new ResponseEntity<>(servico.cadastrar(Carro), HttpStatus.CREATED); 
  }

  @GetMapping
  public ResponseEntity<List<CarroCompletoDto>> obterEstoque() {
    return new ResponseEntity<>(servico.obterTodos(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<CarroDto> obterCarro(@PathVariable String id) {
    Optional<CarroDto> retorno = servico.obterPorId(id);

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> excluirCarro(@PathVariable String id){
    servico.excluirPorId(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @PutMapping("/{id}")
  public ResponseEntity<CarroCompletoDto> atualizarCarro(@PathVariable String id, @RequestBody @Valid CarroCompletoDto Carro){
    Optional<CarroCompletoDto> retorno = servico.atualizarPorId(id, Carro); 

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }
   
  }
  @GetMapping("/porta")
  public String obterPorta(@Value("${local.server.port}") String porta){
    return "A instância que respondeu a requisição está rodando na porta" + porta;
}
}
