package br.com.santander.exception;

import lombok.Getter;

@Getter
public class ReciboCheckInNotFoundException extends RuntimeException {

    private String recibo;

    public ReciboCheckInNotFoundException(String recibo) {
        this.recibo = recibo;
    }
}