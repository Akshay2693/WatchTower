package com.hitherejoe.watchtower.data.model;

public class ErrorResponse {
    public Error error;
    public class Error {
        public int code;
        public String message;
    }
}
