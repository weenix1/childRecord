package com.Adam.childRecord.controller;

import com.Adam.childRecord.model.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<UserResponse> getAllUsers(){


        return Arrays.asList(
                new UserResponse("123456",
                        "Doe",
                        "John",
                        LocalDate.of(1995, Month.JANUARY, 1),
                        LocalTime.of(12, 0),
                        "New York",
                        "New York",
                        "Manhattan",
                        "USA",
                        Arrays.asList("Friendly", "Outgoing")
                ),
                new UserResponse("123457",
                        "Doe",
                        "John",
                        LocalDate.of(1995, Month.JANUARY, 1),
                        LocalTime.of(12, 0),
                        "New York",
                        "New York",
                        "Manhattan",
                        "USA",
                        Arrays.asList("Friendly", "Outgoing")
                ),
                new UserResponse("123458",
                        "Doe",
                        "John",
                        LocalDate.of(1995, Month.JANUARY, 1),
                        LocalTime.of(12, 0),
                        "New York",
                        "New York",
                        "Manhattan",
                        "USA",
                        Arrays.asList("Friendly", "Outgoing")
                ),
                new UserResponse("123459",
                        "Doe",
                        "John",
                        LocalDate.of(1995, Month.JANUARY, 1),
                        LocalTime.of(12, 0),
                        "New York",
                        "New York",
                        "Manhattan",
                        "USA",
                        Arrays.asList("Friendly", "Outgoing")
                )
        );

    }
}
