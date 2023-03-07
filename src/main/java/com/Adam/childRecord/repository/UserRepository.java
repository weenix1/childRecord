package com.Adam.childRecord.repository;

import com.Adam.childRecord.model.UserCreateRequest;
import com.Adam.childRecord.model.UserResponse;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class UserRepository {

    List<UserResponse> users = new ArrayList<>();
      public UserRepository(){
         users.add(
                 new UserResponse(UUID.randomUUID().toString(),
                 "Doe",
                 "John",
                 LocalDate.of(1995, Month.JANUARY, 1),
                 LocalTime.of(12, 0),
                 "New York",
                 "New Carolina",
                 "Manhattan",
                 "USA",
                 Arrays.asList("game", "cool")
         ));

         users.add(
                 new UserResponse(UUID.randomUUID().toString(),
                         "Doe",
                         "John",
                         LocalDate.of(1995, Month.JANUARY, 1),
                         LocalTime.of(12, 0),
                         "New York",
                         "New Carolina",
                         "Manhattan",
                         "USA",
                         Arrays.asList("game", "cool")
                 ));

         users.add(
                 new UserResponse(UUID.randomUUID().toString(),
                         "Doe",
                         "John",
                         LocalDate.of(1995, Month.JANUARY, 1),
                         LocalTime.of(12, 0),
                         "New York",
                         "New Carolina",
                         "Manhattan",
                         "USA",
                         Arrays.asList("game", "cool")
                 ));

                  new UserResponse(UUID.randomUUID().toString(),
                          "Moo",
                          "Game",
                          LocalDate.of(1995, Month.JANUARY, 1),
                          LocalTime.of(12, 0),
                          "New Jersey",
                          "New York",
                          "Manhattan",
                          "USA",
                          Arrays.asList("bad", "good")
                  );
                  new UserResponse(UUID.randomUUID().toString(),
                          "Gooo",
                          "Fish",
                          LocalDate.of(1995, Month.JANUARY, 1),
                          LocalTime.of(12, 0),
                          "York",
                          " York",
                          "Manhattan",
                          "USA",
                          Arrays.asList("gone", "goat")
                  );
                  new UserResponse(UUID.randomUUID().toString(),
                          "Dooo",
                          "Frank",
                          LocalDate.of(1995, Month.JANUARY, 1),
                          LocalTime.of(12, 0),
                          "Berlin",
                          "Berlin",
                          "Berlin",
                          "Germany",
                          Arrays.asList("Friendly", "Outgoing")
                  );
      }

    public Optional<UserResponse> findById(String id) {
        Optional<UserResponse> user = users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
        return user;
    }

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

    public void deleteById(String id) {
        // after deleting u reset the list to the new list
      this.users =  users.stream()
                .filter(u -> !u.getId().equals(id))
                .collect(Collectors.toList());
    }

    public UserResponse save(UserCreateRequest request) {

          UserResponse response =  new UserResponse(
                        UUID.randomUUID().toString(),
                        request.getFirstname(),
                        request.getSurname(),
                        request.getDateOfBirth(),
                        request.getTimeOfBirth(),
                        request.getState(),
                        request.getLocalGovernment(),
                        request.getLocation(),
                        request.getCountry(),
                        request.getTags()
                );
        users.add( response );
        return response;
    }
}
