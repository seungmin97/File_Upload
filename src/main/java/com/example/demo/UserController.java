package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;

@RestController
public class UserController {

    UserMapper userMapper;

    @GetMapping("/")
    public String main() throws Exception {
        mySQLConnectionTest();
        return "index";
    }

    public void mySQLConnectionTest() throws Exception {

        final String DRIVER = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/jongsul?serverTimezone=UTC&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
        final String USER = "jongsul";
        final String PASSWORD = "1234";

        Class.forName(DRIVER);
        try(Connection connection = DriverManager.getConnection(
                URL, USER, PASSWORD
        )){
            System.out.println(connection);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    @RequestMapping(method=RequestMethod.GET, value="/user")
    @ResponseBody
    public String test(){

        return userMapper.findAll("abc").getPw();
    }
}
