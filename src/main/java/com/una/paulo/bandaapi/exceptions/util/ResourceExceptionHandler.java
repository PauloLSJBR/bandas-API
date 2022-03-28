package com.una.paulo.bandaapi.exceptions.util;

import com.una.paulo.bandaapi.exceptions.BandaNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(BandaNotFoundException.class)
    public ResponseEntity<com.una.paulo.bandaapi.exceptions.util.ErrorDetails> handlerCategoriaException(BandaNotFoundException e, HttpServletRequest request) {
        e.printStackTrace();
        com.una.paulo.bandaapi.exceptions.util.ErrorDetails error = new com.una.paulo.bandaapi.exceptions.util.ErrorDetails();
        error.setStatus(404l);
        error.setTitle("Banda exception.");
        error.setUrl("http://erros.teste.com/404");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
