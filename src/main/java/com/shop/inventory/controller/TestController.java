package com.shop.inventory.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;

@RestController
@RequestMapping("/api/test")

public class TestController {

    @GetMapping("/hello")     // ← Debe tener @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("¡Hola! JWT funcionando correctamente - Usuario: " 
            + SecurityContextHolder.getContext().getAuthentication().getName());
    }
}