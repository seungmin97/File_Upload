package com.example.demo;
import lombok.Getter;

public class User {
    private String id;
    @Getter
    private String pw;

    public String getPw() {
        return pw;
    }
}
