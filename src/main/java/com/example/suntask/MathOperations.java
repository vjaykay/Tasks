package com.example.suntask;

public class MathOperations {
    public static int fun(int num1, int num2, char symbol) {
        if(symbol == '+') {
            return num1 + num2;
        } else if (symbol == '-') {
            return num1 - num2;

        } else if (symbol == '*') {
            return num1 * num2;

        }
        else
        {
            return num1 / num2;
        }
    }

}
