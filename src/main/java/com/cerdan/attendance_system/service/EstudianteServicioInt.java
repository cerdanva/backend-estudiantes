/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cerdan.attendance_system.service;

import com.cerdan.attendance_system.model.Estudiante;
import java.util.List;

/**
 *
 * @author Victor
 */
public interface EstudianteServicioInt {
    
    List<Estudiante> listarEstudiante();
    Estudiante buscarEstudiantePorId(Long id);
    Estudiante guardarEstudiante(Estudiante estudiante);
   
    
}
