package com.example.quiz2.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.quiz2.demo.model.Producto;
import com.example.quiz2.demo.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public Producto registrarProducto(Producto producto) {
        producto.setActivo(true);
        return productoRepository.save(producto);
    }

    public List<Producto> buscarPorCategoria(String categoria) {
        return productoRepository.buscarPorCategoria(categoria);
    }
}
