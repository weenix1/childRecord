package com.Adam.childRecord.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class UserCreateRequest {
    private String surname;
    private String firstname;
    private LocalDate dateOfBirth;
    private LocalTime timeOfBirth;
    private String location;
    private String state;
    private String localGovernment;
    private String Country;
    private List<String> tags;

    public UserCreateRequest(
                             String surname,
                             String firstname,
                             LocalDate dateOfBirth,
                             LocalTime timeOfBirth,
                             String location,
                             String state,
                             String localGovernment,
                             String country,
                             List<String> tags) {
        this.surname = surname;
        this.firstname = firstname;
        this.dateOfBirth = dateOfBirth;
        this.timeOfBirth = timeOfBirth;
        this.location = location;
        this.state = state;
        this.localGovernment = localGovernment;
        Country = country;
        this.tags = tags;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalTime getTimeOfBirth() {
        return timeOfBirth;
    }

    public String getLocation() {
        return location;
    }

    public String getState() {
        return state;
    }

    public String getLocalGovernment() {
        return localGovernment;
    }

    public String getCountry() {
        return Country;
    }

    public List<String> getTags() {
        return tags;
    }
}
