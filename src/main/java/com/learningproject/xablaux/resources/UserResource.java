package com.learningproject.xablaux.resources;

import com.learningproject.xablaux.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Marcola","pcc1533@gmail.com","7777777777","qwerty8");
        return ResponseEntity.ok().body(u);
    }
}
