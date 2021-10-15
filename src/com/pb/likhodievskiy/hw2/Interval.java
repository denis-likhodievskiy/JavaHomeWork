package com.pb.likhodievskiy.hw2;

import java.util.Scanner;

class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int x = scanner.nextInt();

        if (x >= 0 && x <= 14) {
            System.out.println("Your number in [0-14]");
        } else if (x >= 15 && x <= 35) {
            System.out.println("Your number in [15-35]");
        } else if (x >= 36 && x <= 50) {
            System.out.println("Your number in [36-50]");
        } else if (x >= 51 && x <= 100) {
            System.out.println("Your number in [51-100]");
        } else {
            System.out.println("Interval not found");
        }
    }
}