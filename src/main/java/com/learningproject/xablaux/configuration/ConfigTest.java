package com.learningproject.xablaux.configuration;

import com.learningproject.xablaux.entities.User;
import com.learningproject.xablaux.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Zé ruela","ruela@gmail.com","98888888","123456");
        User u2 = new User(null,"Panguao da silva","pandasilva@gmail.com","98888888","123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
