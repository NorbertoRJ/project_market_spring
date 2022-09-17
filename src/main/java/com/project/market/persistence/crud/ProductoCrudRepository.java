package com.project.market.persistence.crud;

import com.project.market.persistence.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}