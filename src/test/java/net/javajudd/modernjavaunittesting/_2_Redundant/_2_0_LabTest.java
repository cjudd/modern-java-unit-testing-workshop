package net.javajudd.modernjavaunittesting._2_Redundant;

import net.javajudd.modernjavaunittesting.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Lab 2.0 - Redundant Tests")
public class _2_0_LabTest {

    List<Person> people = List.of(
            new Person("Chris", "Judd"),
            new Person("Jim", "Shingler"),
            new Person("Joseph", "Nusairat")
    );

    List<String> toStrings = List.of(
        "Person{firstName='Chris', lastName='Judd'}",
        "Person{firstName='Jim', lastName='Shingler'}",
        "Person{firstName='Joseph', lastName='Nusairat'}"
    );

    //TODO: 2.0 - Write test to validate Person toString using Repeated tests.
    @Test
    void personToStringRepeated() {
        fail("Implement JUnit Repeated lab.");
    }

    //TODO: 2.1 - Write test to validate Person toString using DynamicTests.
    @Test
    void personToStringDynamic() {
        fail("Implement JUnit Dynamic Test lab.");
    }
}
