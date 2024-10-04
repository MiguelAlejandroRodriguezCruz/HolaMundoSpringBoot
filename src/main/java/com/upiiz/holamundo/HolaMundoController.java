package com.upiiz.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/holaMundo")
    public String holaMundo() {
        return "Hola Mundo de las API's Miguel";
    }

    @GetMapping("/holaMundos")
    public String holaMundos() {
        return "Hola Mundo de las APIS's DDS Miguel";
    }
}
