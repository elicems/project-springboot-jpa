package com.learningproject.xablaux.repositories;

import com.learningproject.xablaux.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
