package net.javajudd.modernjavaunittesting._2_Redundant;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class RedundantTest {

    private List<String> in = Arrays.asList("c", "", "  ", "\n");
    private List<Boolean> out = Arrays.asList(false, true, true, true);

    @Nested
    class Repeated {

        @RepeatedTest(4)
        void blank(RepetitionInfo repetitionInfo) {
            int pos = repetitionInfo.getCurrentRepetition() - 1;
            String string = in.get(pos);
            assertEquals(out.get(pos), string.isBlank());
        }
    }

    @Nested
    class Dynamic {

        @TestFactory
        Stream<DynamicTest> blank() {
            return in.stream().map(s -> dynamicTest("String '" + s + "'", () -> {
                int pos = in.indexOf(s);
                assertEquals(out.get(pos), s.isBlank());
            }));
        }
    }

    @Nested
    class Parameterized {

        @ParameterizedTest
        @ValueSource(strings = {"", "  ", "\n"})
        void isBlank(String string) {
            assertTrue(string.isBlank());
        }

        @ParameterizedTest
        @ValueSource(strings = {"c", "word"})
        void isNotBlank(String string) {
            assertFalse(string.isBlank());
        }
    }

}