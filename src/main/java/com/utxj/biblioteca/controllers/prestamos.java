package com.utxj.biblioteca.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prestamos")
public class prestamos {
    @RequestMapping("/")
    public String prestado() {
        return "Aqui puro prestamo de libros, no hay de otra.";
    }
}
//http://localhost:8080/prestamos/
