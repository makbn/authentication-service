package io.github.makbn.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication

public class UserAuthentication {

    public static void main(String[] args){
        SpringApplication.run(UserAuthentication.class, args);
    }

    @GetMapping("/")

    public String root(){
        return "hello";
    }

}
