package com.example.Lab1Assignment2023;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) throws IllegalArgumentException {
        //I modify this method with throws IllegalArgumentException so that I can test
        // when the divide is invalid. For example when divided by 0
        if (b == 0)
            throw new IllegalArgumentException("Divide by 0");
        return (double) a / (double) b;
    }

    public double squareRootOf(int a) {
        return Math.sqrt(a);
    }

    public double getArea(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double area = Math.PI * (a * a);
        return Math.round(area * 100.0) / 100.0;
    }

    public double getCircumference(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double circumference = Math.PI * 2 * a;
        return Math.round(circumference * 100.0) / 100.0;
    }
}
