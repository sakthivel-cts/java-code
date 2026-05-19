package org.example.basicconcepts;

abstract class DummyAbstract {

    public DummyAbstract(String name) {
        System.out.println("Hi "+name);
    }
}

public class AbstractConstructor {

    public static void main(String[] args) {

        DummyAbstract dummyAbstract = new DummyAbstract("Sakthivel") {
        };
    }
}
