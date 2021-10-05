package net.javajudd.modernjavaunittesting._1_New;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NewFeatureTest {

    //TODO 1.4 - Prevent test from running.
    @Test
    void ignoreTest() {
        fail("Expected failure!!! Temporarily prevent this test from running.");
    }

    //TODO 1.5 - Test all customer properties with new assert method.
    @Test
    void testAllProperties() {
        Customer customer = new Customer("Jane", "Doe");
    }

    //TODO 1.6 - Test expected exception.
    @Test
    void testExpectedExceptions() {
        new ArrayList<String>().get(0);
    }
}