
package com.cerdan.attendance_system.controller;

import com.cerdan.attendance_system.model.Estudiante;
import com.cerdan.attendance_system.service.EstudianteServicio;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Victor
 */
@RestController
@RequestMapping("/api/estudiantes")
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
