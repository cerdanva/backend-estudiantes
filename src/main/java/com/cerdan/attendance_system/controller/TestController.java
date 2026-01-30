package com.cerdan.attendance_system.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")

public class TestController {
    @GetMapping
    public String test() {
        return "API funcionando correctamente";
    }
    
}
