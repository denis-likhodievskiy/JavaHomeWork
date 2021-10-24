package com.pb.likhodievskiy.hw3;

import java.util.Scanner;

class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = (int) (101 * Math.random());
        byte attempt = 1;

        System.out.println("Bingo Game.");
        System.out.println("What is the secret number?");
        do {
            System.out.println("Attempt " + attempt + ". Enter the number or \"exit\" to end the game:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                int inputNumber;

                try {
                    inputNumber = Integer.parseInt(input);
                } catch (Exception e) {
                    System.out.println("Incorrect number. Try again");
                    continue;
                }

                if (inputNumber > secretNumber) {
                    System.out.println("Your number is greater");
                } else if (inputNumber < secretNumber) {
                    System.out.println("Your number is less");
                } else {
                    System.out.println("Bingo!");
                    System.out.println("Attempts: " + attempt);
                    break;
                }

                attempt++;
            }
        } while (true);

        System.out.println("Game over");
    }
}