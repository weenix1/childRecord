package com.Adam.childRecord.repository;

import com.Adam.childRecord.model.UserResponse;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {

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
    public List<UserResponse> findAll(String tag){

        if(tag == null){
            return users;
        }else{
          String  lowercaseTag = tag.toLowerCase();
            //in kotlin we don't need stream and collect, we will only have filter
            return users.stream()
                    .filter(user -> lowercaseTags(user).contains(lowercaseTag))
                    .collect(Collectors.toList());
            // filter users by tag
//            List<UserResponse> filtered = new ArrayList<>();
//            for(UserResponse user: users){
//                if(lowercaseTags(user).contains(tag))
//                    filtered.add(user);
//            }
        }
    }
    private List<String> lowercaseTags(UserResponse user){
        return user.getTags().stream()
                .map(tag -> tag.toLowerCase())
                .collect(Collectors.toList());
//        List<String> lowercaseTags = new ArrayList<>();
//        for(String t: tags) {
//            lowercaseTags.add(t.toLowerCase());
//        }
//        return lowercaseTags;

    }
}
