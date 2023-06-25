package com.example.suntask;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    public void testGetNum1() {
        Addition addition = new Addition();
        addition.setNum1(5);
        assertEquals(5, addition.getNum1());
    }

    @Test
    public void testGetNum2() {
        Addition addition = new Addition();
        addition.setNum2(10);
        assertEquals(10, addition.getNum2());
    }

    @Test
    public void testSetNum1() {
        Addition addition = new Addition();
        addition.setNum1(5);
        assertEquals(5, addition.getNum1());
    }

    @Test
    public void testSetNum2() {
        Addition addition = new Addition();
        addition.setNum2(10);
        assertEquals(10, addition.getNum2());
    }
}

