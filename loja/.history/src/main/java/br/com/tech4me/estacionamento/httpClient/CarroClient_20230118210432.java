package br.com.tech4me.estacionamento.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.estacionamento.model.Carro;

@FeignClient("carro")
public interface CarroClient {
        @RequestMapping(method = RequestMethod.GET, value = "/estoque/{id}")
        Carro obterCarro(@PathVariable String id);

}
