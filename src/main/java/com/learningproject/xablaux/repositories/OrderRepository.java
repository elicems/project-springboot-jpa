package com.learningproject.xablaux.repositories;

import com.learningproject.xablaux.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
