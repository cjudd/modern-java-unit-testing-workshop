package net.javajudd.modernjavaunittesting._3_Extensions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@Tag("brittle")
@BrittleTest
public class AllTaggedTest {

    @Test
    void oneBrittle() {
        assertTrue(true);
    }

    @Test
    void twoBrittle() {
        assertTrue(true);
    }

    @Test
    void threeBrittle() {
        assertTrue(true);
    }

}
