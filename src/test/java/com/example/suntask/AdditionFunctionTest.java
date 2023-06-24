package com.example.suntask;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
@SpringBootTest
public class AdditionFunctionTest {

        AdditionFunction addition = new AdditionFunction();
        @Test
        public void testAdd1(){
            assertNotEquals(7, addition.add(5, 4));
        }

        @Test
        public void testAdd2(){
            assertEquals(50, addition.add(25,25));
        }

    }

