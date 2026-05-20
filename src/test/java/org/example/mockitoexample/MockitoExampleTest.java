package org.example.mockitoexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MockitoExampleTest {

    MockitoExample mockitoExample;

    @BeforeEach
    void setup() {

        mockitoExample = Mockito.mock(MockitoExample.class);
    }

    @Test
    void testAreYouSeniorCitizen() {

        Mockito.when(mockitoExample.areYouSeniorCitizen(60)).thenReturn("Your Senior Citizen");
        assertEquals("Your Senior Citizen", mockitoExample.areYouSeniorCitizen(60));
    }

    @Test
    void testAreYouEligibleToVote() {

        Mockito.when(mockitoExample.areYouEligibleToVote(24)).thenReturn("Your Eligible To Vote");
        assertEquals("Your Eligible To Vote", mockitoExample.areYouEligibleToVote(24));
    }

    @Test
    void testYouHaveAccessOrNot() {

        Mockito.when(mockitoExample.youHaveAccessOrNot("sakthivel")).thenReturn("You Have Access");
        assertEquals("You Have Access", mockitoExample.youHaveAccessOrNot("sakthivel"));
    }
}