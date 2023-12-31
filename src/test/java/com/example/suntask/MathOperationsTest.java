package com.example.suntask;

import com.example.suntask.service.MathOperations;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
@SpringBootTest
public class MathOperationsTest {

        @Test
        public void testFun_Addition() {
            // Arrange
            int num1 = 5;
            int num2 = 3;
            char symbol = '+';
            int expected = 8;

            // Act
            int result = MathOperations.fun(num1, num2, symbol);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        public void testFun_Subtraction() {
            // Arrange
            int num1 = 5;
            int num2 = 3;
            char symbol = '-';
            int expected = 2;

            // Act
            int result = MathOperations.fun(num1, num2, symbol);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        public void testFun_Multiplication() {
            // Arrange
            int num1 = 5;
            int num2 = 3;
            char symbol = '*';
            int expected = 15;

            // Act
            int result = MathOperations.fun(num1, num2, symbol);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        public void testFun_Division() {
            // Arrange
            int num1 = 5;
            int num2 = 3;
            char symbol = '/';
            int expected = 1;

            // Act
            int result = MathOperations.fun(num1, num2, symbol);

            // Assert
            assertEquals(expected, result);
        }

    @Test
    public void testInvalidSymbol() {
        int result = MathOperations.fun(5, 3, '%');
        assertEquals(0, result);
    }
    }




