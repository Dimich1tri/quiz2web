package com.example.quiz2.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz2.demo.model.Producto;
import com.example.quiz2.demo.service.ProductoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @PostMapping
    public ResponseEntity<Map<String, String>> registrarProducto(@Valid @RequestBody Producto producto) {
        productoService.registrarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensaje", "Producto registrado exitosamente"));
    }

    @GetMapping("/buscar/{categoria}")
    public ResponseEntity<List<Producto>> buscarPorCategoria(@PathVariable String categoria) {
        List<Producto> productos = productoService.buscarPorCategoria(categoria);
        return ResponseEntity.ok(productos);
    }
}
