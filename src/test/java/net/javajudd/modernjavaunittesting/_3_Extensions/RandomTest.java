package net.javajudd.modernjavaunittesting._3_Extensions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@ExtendWith(LogExtension.class)
public class RandomTest {

    @Test
    void trueTest() {
        assertTrue(true);
    }

    @Test
    void failTest() {
        fail("Intentional failure");
    }
}
