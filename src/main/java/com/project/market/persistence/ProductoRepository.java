package com.project.market.persistence;

import com.project.market.persistence.crud.ProductoCrudRepository;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
