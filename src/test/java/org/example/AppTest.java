package org.example;

import org.junit.jupiter.api.*;

public class AppTest{

    int sharedObj = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("This is before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("This is before each");
    }

    @Test
    public void test1() {
        System.out.println(++sharedObj);
        System.out.println("This is test - 1");
    }

    @Test
    void test2() {
        System.out.println(sharedObj);
        System.out.println("This is test - 2");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("This is after each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("This is after all");
    }
}