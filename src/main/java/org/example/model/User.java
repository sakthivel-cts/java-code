package org.example.model;

import org.example.creationaldesignpatterns.UserBuilder;

public class User {

    String name;
    int age;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.getName();
        this.age = userBuilder.getAge();
    }

    public void display() {
        System.out.printf("%s | %d\n", name, age);
    }
}