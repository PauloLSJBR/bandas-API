package com.una.paulo.bandaapi.exceptions;

public class BandaNotFoundException extends RuntimeException {

    public BandaNotFoundException(String mensagem) {
        super(mensagem);
    }

    public BandaNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
