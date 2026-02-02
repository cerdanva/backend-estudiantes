/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cerdan.attendance_system.controller;

import com.cerdan.attendance_system.model.Estudiante;
import com.cerdan.attendance_system.service.EstudianteServicio;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Victor
 */
public class EstudianteController {

    private final EstudianteServicio estudianteServicio;
    
    public EstudianteController(EstudianteServicio estudianteServicio) {
        this.estudianteServicio = estudianteServicio;
    }
    
    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante student) {
        return estudianteServicio.guardarEstudiante(student);
    }

    @GetMapping
    public List<Estudiante> ListarEstudiantes() {
        return estudianteServicio.listarEstudiante();
    }

    @GetMapping("/{id}")
    public Estudiante buscarEstudiantePorId(@PathVariable Long id) {
        return estudianteServicio.buscarEstudiantePorId(id);
    }
    
}
