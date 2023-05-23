package com.project.test.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;

class MultiNestedTest {
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
        void testForMethodA() {
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
        void testForMethodA() {
            System.out.println("Example test for method B");
        }
    }
}