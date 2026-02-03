
package com.cerdan.attendance_system.service;

import com.cerdan.attendance_system.model.Estudiante;
import com.cerdan.attendance_system.repository.EstudianteRepositorio;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author Victor
 */

@Service
public class EstudianteServicio implements EstudianteServicioInt {

    private EstudianteRepositorio estudianteRepositorio;

    public EstudianteServicio(EstudianteRepositorio estudianteRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
    }

    @Override
    public List<Estudiante> listarEstudiante() {
        return estudianteRepositorio.findAll();
    }

    @Override
    public Estudiante buscarEstudiantePorId(Long id) {
        return estudianteRepositorio.findById(id).orElseThrow(() -> new RuntimeException("No existe el estudiante"));

    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

}
