package org.example.creationaldesignpatterns;

import org.example.model.User;

public class UserBuilder {

    String name;
    int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public User build() {
        return new User(this);
    }
}