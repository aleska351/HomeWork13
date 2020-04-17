package com.company;

public class MyDomainException extends Exception {
    String detail;

    public MyDomainException(String message, String detail) {
        super(message);
        this.detail = detail;
    }
}
