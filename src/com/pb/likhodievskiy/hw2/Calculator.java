package com.pb.likhodievskiy.hw2;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int operand1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int operand2 = scanner.nextInt();

        System.out.println("Enter sign (+, -, *, /):");
        String sign = scanner.next();

        switch (sign.charAt(0)) {
            case '+':
                System.out.println("Result: " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Result: " + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Result: " + (operand1 * operand2));
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    if (operand1 % operand2 > 0) {
                        System.out.println("Result: " + ((double) operand1 / operand2));
                    } else {
                        System.out.println("Result: " + (operand1 / operand2));
                    }
                }
                break;
            default:
                System.out.println("Error: Incorrect sign");
        }
    }
}