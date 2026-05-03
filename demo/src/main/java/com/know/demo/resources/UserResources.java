package com.know.demo.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.know.demo.entities.User;

@RestController
@RequestMapping(value = "/users")   
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@example.com", "123456", "123456789");
        return ResponseEntity.ok().body(u);
    }
}
