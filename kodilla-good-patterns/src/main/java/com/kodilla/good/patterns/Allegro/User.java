package com.kodilla.good.patterns.Allegro;

public class User {
    private String name;
    private String Surname;

    public User(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }
}
