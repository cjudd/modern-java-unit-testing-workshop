package net.javajudd.modernjavaunittesting._1_New;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IgnoreTest {

    //TODO 1.1 - Prevent test from running.
    @Test
    void ignoreTest() {
        fail("Unexpected failure!!! Temporarily prevent this test from running.");
    }

}