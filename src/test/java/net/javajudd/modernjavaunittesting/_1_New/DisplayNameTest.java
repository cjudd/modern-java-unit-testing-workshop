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
        void validateUser() {}

        @Test
        void invalidUserIdDoesNotExist() {}

        @Test
        void invalid_user_password() {}
    }

    @Nested
    @DisplayNameGeneration(ReplaceUnderscores.class)
    class Underscores_Names {
        @Test
        void validate_user() {}

        @Test
        void invalid_user_id_does_not_exist() {}

        @Test
        void invalid_user_password() {}
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
