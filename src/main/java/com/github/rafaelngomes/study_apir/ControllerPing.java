package com.github.rafaelngomes.study_apir;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ping") //mapear a requisição 
public class ControllerPing {

    @GetMapping //tem funcionalidade dentro de uma controller
    public String ping() {
        return "pong";
    }
}
