package net.javajudd.modernjavaunittesting._1_New;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Examples of Display Names.")
public class DisplayNameTest {

    @Nested
    @DisplayName("Default Display Names")
    class DefaultMethodNames {
        @Test
        void validateCustomer() {}

        @Test
        void invalidCustomerIdDoesNotExist() {}

        @Test
        void invalid_customer_password() {}
    }

    @Nested
    @DisplayNameGeneration(ReplaceUnderscores.class)
    class Underscores_Names {
        @Test
        void validate_customer() {}

        @Test
        void invalid_customer_id_does_not_exist() {}

        @Test
        void invalid_customer_password() {}
    }

    @Nested
    @DisplayName("Examples of DisplayNames with Special Characters")
    class SpecialCharacters {

        @Test
        @DisplayName("╯°□°）╯")
        void specialCharacters() {}

        @Test
        @DisplayName("😺")
        void emoji() {}
    }
}
