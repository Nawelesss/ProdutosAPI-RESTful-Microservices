package br.com.tech4me.loja.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.loja.model.Produto;

@FeignClient("produto")
public interface ProdutoClient {
        @RequestMapping(method = RequestMethod.GET, value = "/api/{id}")
        Produto obterProduto(@PathVariable String id);
        @RequestMapping(method = RequestMethod.PUT, value = "/api/{id}")
        void atualizarBooleana(@PathVariable String id@)
        
      
}
