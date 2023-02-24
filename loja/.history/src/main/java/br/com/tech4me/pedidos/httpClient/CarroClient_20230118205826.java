package br.com.tech4me.pedidos.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.pedidos.model.Pizza;

@FeignClient("carro")
public interface CarroClient {
        @RequestMapping(method = RequestMethod.GET, value = "/estoque/{id}")
        Pizza obterCarro(@PathVariable String id);

}
