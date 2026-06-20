package com.learningproject.xablaux.repositories;

import com.learningproject.xablaux.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
