package org.example.model;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class Student {

    private int id;
    private String name;
    private int age;
    private char grade;
}