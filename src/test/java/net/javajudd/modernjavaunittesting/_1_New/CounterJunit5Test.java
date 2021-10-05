package net.javajudd.modernjavaunittesting._1_New;

import net.javajudd.modernjavaunittesting.Counter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterJunit5Test {

    private Counter counter;

    @BeforeEach
    void beforeEach() {
        counter = new Counter();
    }

    @AfterEach
    void afterEach() {
        counter = null;
    }

    @Test
    void defaultValue() {
        assertEquals(0, counter.getValue(), "Default value is 0.");
    }

    @Test
    void initializedValue() {
        counter = new Counter(10);
        assertEquals(10, counter.getValue(), "Must be able to initialize counter.");
    }

    @Test
    void initializedValueLazyMessage() {
        int expected = 10;
        counter = new Counter(expected);
        assertEquals(expected, counter.getValue(), "Must be initialized to " + expected + ".");
    }

    @Test
    void increment() {
        counter.increment();
        assertEquals(1, counter.getValue(), "Increment must increase value by 1.");
    }

    @Test
    void decrement() {
        counter.decrement();
        assertEquals(-1, counter.getValue(), "Decrement must decrease value by 1.");
    }

    @Test
    void reset() {
        for(int i = 0; i < 10; i++) {
            counter.increment();
        }

        counter.reset();
        assertEquals(0, counter.getValue(), "Reset must set value back to original value.");
    }
}