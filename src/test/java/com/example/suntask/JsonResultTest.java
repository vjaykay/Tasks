package com.example.suntask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsonResultTest {

    @Test
    public void testGetInput1() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setInput1(5);
        assertEquals(5, jsonResult.getInput1());
    }

    @Test
    public void testGetInput2() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setInput2(10);
        assertEquals(10, jsonResult.getInput2());
    }

    @Test
    public void testGetResult() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setResult(15);
        assertEquals(15, jsonResult.getResult());
    }

    @Test
    public void testSetInput1() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setInput1(5);
        assertEquals(5, jsonResult.getInput1());
    }

    @Test
    public void testSetInput2() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setInput2(10);
        assertEquals(10, jsonResult.getInput2());
    }

    @Test
    public void testSetResult() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setResult(15);
        assertEquals(15, jsonResult.getResult());
    }
}

