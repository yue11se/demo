package com.example.demo.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        System.out.println("主修改1");
        System.out.println("dev修改1");
        return "Hello World";
    }
}
