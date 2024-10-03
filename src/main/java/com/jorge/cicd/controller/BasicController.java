package com.jorge.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BasicController {
    @GetMapping("/greeting")
    public Mono<String> greeting(){
        return Mono.just("CI/CD Practice").log();
    }
}
