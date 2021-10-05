package net.javajudd.modernjavaunittesting._1_New;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertTests {

    private Address address;

    @BeforeEach
    void setUp() {
        address = new Address("100 Main St.",
                "Apt 103",
                "Columbus",
                "OH",
                "43085");
    }

    @Test
    void eachProperty() {
        assertEquals("100 Main St.", address.getLine1());
        assertEquals("Apt 103", address.getLine2());
        assertEquals("Columbus", address.getCity());
        assertEquals("OH", address.getState());
        assertEquals("43085", address.getZip());
        assertEquals("Address{line1='100 Main St.', city='Columbus', state='OH', zip='43085'}", address.toString());
    }

    @Test
    void assertAllProperties() {
        assertAll("Must match address.",
                () -> assertEquals("100 Main St.", address.getLine1()),
                () -> assertEquals("Apt 103", address.getLine2()),
                () -> assertEquals("Columbus", address.getCity()),
                () -> assertEquals("OH", address.getState()),
                () -> assertEquals("43085", address.getZip()),
                () -> assertEquals("Address{line1='100 Main St.', city='Columbus', state='OH', zip='43085'}", address.toString())
        );
    }
}
