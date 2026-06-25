package com.learningproject.xablaux.services;

import com.learningproject.xablaux.entities.User;
import com.learningproject.xablaux.repositories.UserRepository;
import com.learningproject.xablaux.services.exceptions.DatabaseException;
import com.learningproject.xablaux.services.exceptions.EntityNotFoundException;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new EntityNotFoundException(id));
    }
    public User insert(User obj){
        return userRepository.save(obj);
    }
    public void delete(Long id){
        try {
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new EntityNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }
    public User update(Long id,User obj){
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, obj);
            return userRepository.save(entity);
        }catch (jakarta.persistence.EntityNotFoundException e){
            throw new EntityNotFoundException(id);
        }
    }
    public void updateData(User entity,User obj){
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
