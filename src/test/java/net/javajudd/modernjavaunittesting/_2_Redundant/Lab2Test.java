package net.javajudd.modernjavaunittesting._2_Redundant;

import net.javajudd.modernjavaunittesting.Customer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Lab 2 - Redundant Tests")
public class Lab2Test {

    List<Customer> customers = List.of(
            new Customer("Chris", "Judd"),
            new Customer("Jim", "Shingler"),
            new Customer("Joseph", "Nusairat")
    );

    List<String> toStrings = List.of(
        "Customer{firstName='Chris', lastName='Judd'}",
        "Customer{firstName='Jim', lastName='Shingler'}",
        "Customer{firstName='Joseph', lastName='Nusairat'}"
    );

    //TODO: 2.1 - Write test to validate Customer toString using Repeated tests.
    @Test
    void customerToStringRepeated() {
        fail("Implement JUnit Repeated lab.");
    }

    //TODO: 2.2 - Write test to validate Customer toString using DynamicTests.
    @Test
    void customerToStringDynamic() {
        fail("Implement JUnit Dynamic Test lab.");
    }
}
