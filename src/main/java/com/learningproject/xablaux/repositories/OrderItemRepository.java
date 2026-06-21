package com.learningproject.xablaux.repositories;

import com.learningproject.xablaux.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
