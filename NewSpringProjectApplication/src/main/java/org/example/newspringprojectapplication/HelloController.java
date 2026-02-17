package org.example.newspringprojectapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        return "<b>Hello World</b>";
    }

    @GetMapping("/")
    public String welcomeHome(){
        return "<h1>Welcome Home</h1>";
    }

    @GetMapping("/test")
    public String testing(){
        return "prince... dkumar";
    }
}
