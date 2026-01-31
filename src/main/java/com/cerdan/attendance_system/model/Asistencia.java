package com.cerdan.attendance_system.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private boolean presente;

    @ManyToOne
    @JoinColumn(name = "Estudiante_id")
    private Estudiante estudiante;
}
