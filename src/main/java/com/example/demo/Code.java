package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    private int index;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code= code;
    }

    public int getIndex() {return index;}
    public void setIndex(int index) {this.index = index;}

}
