package net.javajudd.modernjavaunittesting._1_New;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Nested Example")
class NestedTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Nested
    @DisplayName("Tests for the method A")
    class A {

        @BeforeEach
        void beforeEach() {
            System.out.println("Before each test method of the A class");
        }

        @AfterEach
        void afterEach() {
            System.out.println("After each test method of the A class");
        }

        @Test
        @DisplayName("Example test for method A")
        void sampleTestForMethodA() {
            System.out.println("Example test for method A");
        }
    }

    @Nested
    @DisplayName("Tests for the method B")
    class B {

        @BeforeEach
        void beforeEach() {
            System.out.println("Before each test method of the B class");
        }

        @AfterEach
        void afterEach() {
            System.out.println("After each test method of the B class");
        }

        @Test
        @DisplayName("Example test for method B")
        void sampleTestForMethodB() {
            System.out.println("Example test for method B");
        }

        @Nested
        @DisplayName("Tests for the method C")
        class C {

            @BeforeEach
            void beforeEach() {
                System.out.println("Before each test method of the C class");
            }

            @AfterEach
            void afterEach() {
                System.out.println("After each test method of the C class");
            }

            @Test
            @DisplayName("Example test for method C")
            void sampleTestForMethodC() {
                System.out.println("Example test for method C");
            }
        }
    }
}