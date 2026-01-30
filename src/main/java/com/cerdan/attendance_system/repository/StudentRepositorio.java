package com.cerdan.attendance_system.repository;

import com.cerdan.attendance_system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepositorio extends JpaRepository<Student,Long>{
    
    Optional<Student> findByDni(String dni);

}