package com.example.quiz2.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import com.example.quiz2.demo.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE p.categoria = :categoria")
    List<Producto> buscarPorCategoria(@Param("categoria") String categoria);
}
