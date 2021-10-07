package net.javajudd.modernjavaunittesting._3_Extensions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaggedTest {

    @Test
    void notBrittle() {
        assertTrue(true);
    }

    @Test
    //@Tag("brittle")
    @BrittleTest
    void anotherBrittle() {
        assertTrue(true);
    }
}
