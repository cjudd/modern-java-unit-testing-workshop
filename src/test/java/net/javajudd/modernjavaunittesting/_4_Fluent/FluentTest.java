package net.javajudd.modernjavaunittesting._4_Fluent;

import net.javajudd.modernjavaunittesting.Person;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FluentTest {

    Person superman = new Person("Clark", "Kent");
    Person batman = new Person("Bruce", "Wayne");
    Person greenArrow = new Person("Oliver", "Queen");
    Person santa = new Person("Santa", "Claus");

    List<Person> superheros = List.of(superman, batman, greenArrow);

    @Test
    void assertEquality() {
        assertEquals("Kent", superman.getLastName());
    }

    @Test
    void assertThatEquality() {
        assertThat(superman.getLastName()).isEqualTo("Kent");
    }

    @Test
    void assertInEquality() {
        assertNotEquals("Fox", superman.getLastName());
    }

    @Test
    void assertThatInEquality() {
        assertThat(superman.getLastName()).isNotEqualTo("Fox");
    }

    @Test
    void assertList() {
        assertEquals(3, superheros.size());
        assertEquals(superman, superheros.get(0));
    }

    @Test
    void assertThatList() {
        assertThat(superheros).hasSize(3)
                .contains(superman, batman, greenArrow)
                .doesNotContain(santa);
    }

    @Test
    void assertExceptions() {
        Exception ex = assertThrows(
                FileNotFoundException.class,
                () -> new FileInputStream(new File("bogus"))
        );
        assertEquals("bogus (No such file or directory)", ex.getMessage());
    }

    @Test
    void fluentException() {
        assertThatThrownBy(() -> { new FileInputStream(new File("bogus")); }).hasMessage("bogus (No such file or directory)");
    }
}
