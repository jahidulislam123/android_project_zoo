package com.example.lab_project;

public class User {
    private int age;
    private String email;
    private int hours;
    private String name;
    private String phone;

    // Required empty constructor for Firebase
    public User() {}

    public User(int age, String email, int hours, String name, String phone) {
        this.age = age;
        this.email = email;
        this.hours = hours;
        this.name = name;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    // Getters and setters
    // ...
}

