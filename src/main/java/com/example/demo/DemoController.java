package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    //Code code;

    @GetMapping("/")
    public String main(){
        return "index";
    }

    /*@PostMapping("/code")
    public String setCode(String code){
        this.code.setCode(code);

        System.out.println(this.code.getCode());
        return "result";
    }*/


}

