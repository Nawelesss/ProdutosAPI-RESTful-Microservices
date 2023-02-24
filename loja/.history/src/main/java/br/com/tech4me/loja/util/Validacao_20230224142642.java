package br.com.tech4me.loja.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Validacao extends ResponseEntityExceptionHandler{
    @Override
     @Nullable
     protected ResponseEntity<Object> handleMethodArgumentNotValid(
        MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        // Seu código aqui
     {

    String mensagem = ex.getBindingResult().getFieldErrors().stream()
            .map(e -> e.getDefaultMessage())
            .findFirst()
            .orElse("Dados da requisição inválidos");

    return new ResponseEntity<>(mensagem, status);
}
    
}
