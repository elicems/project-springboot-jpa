package com.learningproject.xablaux.repositories;

import com.learningproject.xablaux.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
