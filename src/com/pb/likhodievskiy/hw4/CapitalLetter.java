package com.pb.likhodievskiy.hw4;

import java.util.Scanner;

class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String input = scanner.nextLine();

        System.out.println("Result: " + convert(input));
    }

    private static String convert(String input) {
        String[] strArray = input.split(" ");
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > 0) {
                strBuilder.append(strArray[i].substring(0, 1).toUpperCase());

                if (strArray[i].length() > 1) {
                    strBuilder.append(strArray[i].substring(1));
                }
            }

            strBuilder.append(" ");
        }

        return strBuilder.toString();
    }
}