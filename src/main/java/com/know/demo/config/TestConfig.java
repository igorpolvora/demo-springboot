package com.know.demo.config;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.know.demo.entities.User;
import com.know.demo.repositories.OrderRepository;
import com.know.demo.repositories.UserRepository;
import com.know.demo.entities.Order;
import java.util.Arrays;
import com.know.demo.entities.enums.OrderStatus;
import com.know.demo.repositories.CategoryRepository;
import com.know.demo.entities.Category;
import com.know.demo.repositories.ProductRepository;
import com.know.demo.entities.Product;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);

        Category c1 = new Category(null, "Electronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.0, "https://imgur.com/1345678");
        Product p2 = new Product(null, "Smart TV", "Lorem ipsum dolor sit amet, consectetur.", 2190.0, "https://imgur.com/1345678");
        Product p3 = new Product(null, "Macbook Pro", "Lorem ipsum dolor sit amet, consectetur.", 1250.0, "https://imgur.com/1345678");
        Product p4 = new Product(null, "PC Gamer", "Lorem ipsum dolor sit amet, consectetur.", 1200.0, "https://imgur.com/1345678");
        Product p5 = new Product(null, "Rails for Dummies", "Lorem ipsum dolor sit amet, consectetur.", 100.99, "https://imgur.com/1345678");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        p1.getCategories().add(c2);
        p2.getCategories().add(c1);
        p3.getCategories().add(c3);
        p4.getCategories().add(c3);
        p5.getCategories().add(c2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
    }
}
