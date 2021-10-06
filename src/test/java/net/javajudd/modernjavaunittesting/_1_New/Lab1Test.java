package net.javajudd.modernjavaunittesting._1_New;

import net.javajudd.modernjavaunittesting.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Lab 2 - New Java Features Tests")
class Lab1Test {

    //TODO 1.4 - Prevent test from running.
    @Test
    void ignoreTest() {
        fail("Expected failure!!! Temporarily prevent this test from running.");
    }

    //TODO 1.7 - Wrap the Person related tests in a nested people test class creating Person instance in lifecycle methods.
    //TODO 1.5 - Test all person properties with new assert method.
    @Test
    void testAllProperties() {
        Person person = new Person("Jane", "Doe");
    }

    //TODO 1.6 - Test expected exception.
    @Test
    void testExpectedExceptions() {
        new ArrayList<String>().get(0);
    }

    //TODO 1.8 - Add a display name with an emoji to entertain your coworkers.
    @Test
    void displayName() {}
}