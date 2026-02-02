package com.cerdan.attendance_system.repository;

import com.cerdan.attendance_system.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {

    

}