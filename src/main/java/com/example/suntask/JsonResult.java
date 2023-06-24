package com.example.suntask;
public class JsonResult {
    private int input1;
    private int input2;

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getInput1() {
        return input1;
    }

    public int getInput2() {
        return input2;
    }

    public int getResult() {
        return result;
    }

    private int result;
}
