/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cerdan.attendance_system.repository;

import com.cerdan.attendance_system.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
/**
 *
 * @author Victor
 */
public interface UserRepositorio extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
    

