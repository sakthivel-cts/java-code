package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DemoTest {

    int i = 0;

    @Test
    void test1() {
        i++;
        System.out.println(i);
    }

    @Test
    void test2() {
        i++;
        System.out.println(i);
    }
}