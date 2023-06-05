package com.example.lab_project;

// UserData.java
public class collectdata {

     String name;
     String email;
     String phone;
     int age;
     int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public collectdata(String name, String email, String phone, int age, int hours) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.hours = hours;
    }


}
