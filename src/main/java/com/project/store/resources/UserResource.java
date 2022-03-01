package com.project.store.resources;

import com.project.store.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Nathan", "nathanoliveira3@gmail.com", "123456", "12345");
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
}
