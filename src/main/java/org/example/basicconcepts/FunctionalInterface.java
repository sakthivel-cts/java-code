package org.example.basicconcepts;

interface Calculate {
    int addition(int a, int b);
}

public class FunctionalInterface {

    public static void main(String[] args) {

        Calculate calculate = (int i, int j) -> {
            System.out.println("I am adding the number, Please wait bro!!!");
            return i+j;
        };

        System.out.println(calculate.addition(12, 18));
    }
}