package com.utxj.biblioteca.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class usuarios {
    @GetMapping("/trabajador/{numeroTrabajador}/{nombre}/{apellidoPaterno}/{apellidoMaterno}/{area}")
    public String trabajador(@PathVariable int numeroTrabajador, @PathVariable String nombre, @PathVariable String apellidoPaterno, @PathVariable String apellidoMaterno, @PathVariable String area) {
        return "<li><b>Numero de trabajador: </b>" + numeroTrabajador+"</li><li><b>Nombre: </b>" + nombre+"</li><li><b>Apellido Paterno: </b>" + apellidoPaterno+"</li><li><b>Apellido Materno: </b>" + apellidoMaterno+"</li><li><b>Area: </b>" + area+"</li>";
    }

    @GetMapping("/alumnos/{matricula}/{nombre}/{apellidoPaterno}/{apellidoMaterno}/{carrera}") //A fuerza comilla doble ehh
    public String alumnos(@PathVariable int matricula, @PathVariable String nombre, @PathVariable String apellidoPaterno, @PathVariable String apellidoMaterno, @PathVariable String carrera) {
        return "<li><b>Matricula: </b>" + matricula+"</li><li><b>Nombre: </b>" + nombre+"</li><li><b>Apellido Paterno: </b>" + apellidoPaterno+"</li><li><b>Apellido Materno: </b>" + apellidoMaterno+"</li><li><b>Carrera: </b>" + carrera+"</li>";
    }

}
