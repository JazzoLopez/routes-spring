package com.utxj.biblioteca.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/libros")
public class libros {
    @GetMapping("/novelas/{folio}/{titulo}/{autor}/{editorial}")
    public String novelas(@PathVariable int folio, @PathVariable String titulo, @PathVariable String autor, @PathVariable String editorial) {
        return "<li><b>Folio: </b>" + folio+"</li><li><b>Titulo: </b>" + titulo+"</li><li><b>Autor: </b>" + autor+"</li><li><b>Editorial: </b>" + editorial+"</li>";
    }
    
    @GetMapping("/cuentos/{folio}/{titulo}/{autor}/{editorial}")
    public String cuentos(@PathVariable int folio, @PathVariable String titulo, @PathVariable String autor, @PathVariable String editorial) {
        return "<li><b>Folio: </b>" + folio+"</li><li><b>Titulo: </b>" + titulo+"</li><li><b>Autor: </b>" + autor+"</li><li><b>Editorial: </b>" + editorial+"</li>";
    }
}
