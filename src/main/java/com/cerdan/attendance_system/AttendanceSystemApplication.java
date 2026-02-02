package com.cerdan.attendance_system;

import com.cerdan.attendance_system.service.EstudianteServicioInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendanceSystemApplication.class, args);
    }

}
