package com.folco.APIfolco.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludosController {

    @GetMapping("/hello")
    public ResponseEntity<String> saludo() {
        return ResponseEntity.ok("Hola mi nombre es Gonza");
    }

    @GetMapping("/hello2/(nombre)")
    public String hola2(@PathVariable String nombre) {
        return "Hola mi nombre es" + nombre;
    }

    @PostMapping("/goodbye")
    public String chau(){
    return "hasta luego";
    }
}