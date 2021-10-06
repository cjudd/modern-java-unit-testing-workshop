package net.javajudd.modernjavaunittesting._4_Fluent;

import net.javajudd.modernjavaunittesting.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Lab 4.1 - Fluent Tests")
public class _4_1_LabTest {

    Person ironman = new Person("Tony", "Stark");
    Person captainAmerica = new Person("Steve", "Rogers");
    Person blackWidow = new Person("Natasha", "Romanoff");
    Person santa = new Person("Santa", "Claus");

    List<Person> superheros = List.of(ironman, captainAmerica, blackWidow);

    //TODO 4.0 - Rewrite in a fluent way using AssertJ
    @Test
    void assertEquality() {
        assertEquals("Stark", ironman.getLastName());
    }

    //TODO 4.1 - Rewrite in a fluent way using AssertJ
    @Test
    void assertInEquality() {
        assertNotEquals("Hogan", ironman.getLastName());
    }

    //TODO 4.2 - Rewrite in a fluent way using AssertJ
    @Test
    void assertList() {
        assertEquals(3, superheros.size());
        assertEquals(ironman, superheros.get(0));
        assertEquals(captainAmerica, superheros.get(1));
        assertEquals(blackWidow, superheros.get(2));
        assertFalse(superheros.contains(santa));
    }

    //TODO 4.3 - Rewrite in a fluent way using AssertJ
    @Test
    void assertPropertiesOfObjectsInList() {
        assertEquals("Tony", superheros.get(0).getFirstName());
        assertEquals("Stark", superheros.get(0).getLastName());
        assertEquals("Steve", superheros.get(1).getFirstName());
        assertEquals("Rogers", superheros.get(1).getLastName());
        assertEquals("Natasha", superheros.get(2).getFirstName());
        assertEquals("Romanoff", superheros.get(2).getLastName());
    }
}
