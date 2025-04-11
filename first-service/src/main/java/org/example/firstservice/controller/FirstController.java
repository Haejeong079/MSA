package org.example.firstservice.controller;


//http://localhost:8081/welcome

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/first-service")
@RestController
@RequiredArgsConstructor
@Slf4j
public class FirstController {

    private final Environment env;


    @GetMapping("/welcome")
    public String welcome(){

        return "welcome to the Fist Service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){
        log.info(header);

        return "welcome to the Fist Service";

    }

    @GetMapping("/check")
    public String check(HttpServletRequest request){
        log.info("Server port={}", request.getServerPort());

        return String.format("HI, there. This is a message from First Service on Port %s",
                env.getProperty("local.server.port"));
    }
}
