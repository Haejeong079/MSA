package org.example.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.userservice.vo.Greeting;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    //private final Environment env;
    private final Greeting greeting;

    @GetMapping("/health_check")
    private String status(){

        return "It's Working in User Service";
    }

    @GetMapping("/welcome")
    private String welcome(){

        return greeting.getMessage();
    }

}
