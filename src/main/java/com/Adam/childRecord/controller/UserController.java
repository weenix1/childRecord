package com.Adam.childRecord.controller;

import com.Adam.childRecord.model.UserCreateRequest;
import com.Adam.childRecord.model.UserResponse;
import com.Adam.childRecord.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

@RestController
public class UserController {

    UserRepository userRepository = new UserRepository();
    @GetMapping("/users")
    public List<UserResponse> getAllUsers(
            @RequestParam(required = false) String tag
    ){
        return userRepository.findAll(tag);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponse> getUserById(
            @PathVariable String id
    ){
        Optional<UserResponse> user = userRepository.findById(id);
        if(user.isPresent())
            return ResponseEntity.ok(user.get());
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping("/users/createUser")
    public UserResponse createUser(
            @RequestBody UserCreateRequest request
    ){
        return userRepository.save(
               request
        );
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<UserResponse> deleteUser(
            @PathVariable String id
    ){
        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
