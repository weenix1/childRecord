package com.Adam.childRecord.controller;

import com.Adam.childRecord.model.UserResponse;
import com.Adam.childRecord.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    UserRepository userRepository = new UserRepository();
    @GetMapping("/users")
    public List<UserResponse> getAllUsers(
            @RequestParam(required = false) String tag
    ){
        return userRepository.findAll(tag);
    }
}
