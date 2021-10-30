package com.pb.likhodievskiy.hw4;

import java.util.Scanner;
import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first sentence:");
        String firstInputString = scanner.nextLine();

        System.out.println("Enter second sentence:");
        String secondInputString = scanner.nextLine();

        System.out.println(checkAnagram(firstInputString, secondInputString) ? "The second sentence is the anagram of the first" : "The second sentence is not an anagram of the first");
    }

    private static String filter(String input) {
        return input.toLowerCase().replaceAll("[^a-zа-яёїіґ]", "");
    }

    private static boolean checkAnagram(String firstInputString, String secondInputString) {
        char[] firstCharArray = filter(firstInputString).toCharArray();
        char[] secondCharArray = filter(secondInputString).toCharArray();

        if (firstCharArray.length == secondCharArray.length) {
            Arrays.sort(firstCharArray);
            Arrays.sort(secondCharArray);

            return Arrays.equals(firstCharArray, secondCharArray);
        } else {
            return false;
        }
    }
}