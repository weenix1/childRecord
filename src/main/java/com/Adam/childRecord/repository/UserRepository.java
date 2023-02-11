package com.Adam.childRecord.repository;

import com.Adam.childRecord.model.UserResponse;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRepository {

    public List<UserResponse> findAll(String tag){

        List<UserResponse> users = Arrays.asList(
                new UserResponse("123456",
                        "Doe",
                        "John",
                        LocalDate.of(1995, Month.JANUARY, 1),
                        LocalTime.of(12, 0),
                        "New York",
                        "New Carolina",
                        "Manhattan",
                        "USA",
                        Arrays.asList("game", "cool")
                ),
                new UserResponse("123457",
                        "Moo",
                        "Game",
                        LocalDate.of(1995, Month.JANUARY, 1),
                        LocalTime.of(12, 0),
                        "New Jersey",
                        "New York",
                        "Manhattan",
                        "USA",
                        Arrays.asList("bad", "good")
                ),
                new UserResponse("123458",
                        "Gooo",
                        "Fish",
                        LocalDate.of(1995, Month.JANUARY, 1),
                        LocalTime.of(12, 0),
                        "York",
                        " York",
                        "Manhattan",
                        "USA",
                        Arrays.asList("gone", "goat")
                ),
                new UserResponse("123459",
                        "Dooo",
                        "Frank",
                        LocalDate.of(1995, Month.JANUARY, 1),
                        LocalTime.of(12, 0),
                        "Berlin",
                        "Berlin",
                        "Berlin",
                        "Germany",
                        Arrays.asList("Friendly", "Outgoing")
                )
        );

        if(tag == null){
            return users;
        }else{
            tag = tag.toLowerCase();
            List<UserResponse> filtered = new ArrayList<>();

            for(UserResponse user: users){

                List<String> lowercaseTags = new ArrayList<>();
                for(String t: user.getTags()) {
                    lowercaseTags.add(t.toLowerCase());
                }
                if(lowercaseTags.contains(tag))
                    filtered.add(user);
            }
            return filtered;
        }
    }
}
