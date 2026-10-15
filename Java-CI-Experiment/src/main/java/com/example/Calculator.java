package com.example;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Calculator results");
        System.out.println("3 + 5 = " + calculator.add(3, 5));
        System.out.println("9 - 5 = " + calculator.subtract(9, 5));
        System.out.println("6 * 7 = " + calculator.multiply(6, 7));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
