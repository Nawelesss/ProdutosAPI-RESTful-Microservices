package br.com.tech4me.loja.util;


@ControllerAdvice
public class Validacao extends ResponseEntityExceptionHandler{
    @Override
     @Nullable
     protected ResponseEntity<Object> handleMethodArgumentNotValid(
        MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        // Seu código aqui
     

    String mensagem = ex.getBindingResult().getFieldErrors().stream()
            .map(e -> e.getDefaultMessage())
            .findFirst()
            .orElse("Dados da requisição inválidos");

    return new ResponseEntity<>(mensagem, status);
}
    
}
