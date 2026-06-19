package com.learningproject.xablaux.configuration;

import com.learningproject.xablaux.entities.Order;
import com.learningproject.xablaux.entities.User;
import com.learningproject.xablaux.entities.enums.OrderStatus;
import com.learningproject.xablaux.repositories.OrderRepository;
import com.learningproject.xablaux.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Zé ruela","ruela@gmail.com","98888888","123456");
        User u2 = new User(null,"Panguao da silva","pandasilva@gmail.com","98888888","123456");

        userRepository.saveAll(Arrays.asList(u1,u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);

        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }

}
