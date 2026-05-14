package org.example.creationaldesignpatterns;

public class SingletonDesignPattern {

    private static SingletonDesignPattern instance;

    private SingletonDesignPattern() {}

    public static SingletonDesignPattern getInstance() {
        if(instance == null) instance = new SingletonDesignPattern();

        return instance;
    }
}