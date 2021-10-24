package com.pb.likhodievskiy.hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final byte MAX_COUNT = 10;
        int[] inputArray = new int[MAX_COUNT];
        byte index = 0;
        int sum = 0;
        byte positiveNumbersCount = 0;

        System.out.println("Enter " + MAX_COUNT + " numbers:");
        do {
            String input = scanner.nextLine();

            try {
                inputArray[index] = Integer.parseInt(input);
                sum += inputArray[index];
                if (inputArray[index] > 0) {
                    positiveNumbersCount++;
                }
            } catch (Exception e) {
                System.out.println("Incorrect number. Try again");
                continue;
            }

            index++;
        } while (index < MAX_COUNT);

        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Array length: " + inputArray.length);
        System.out.println("Array items sum: " + sum);
        System.out.println("Positive numbers count: " + positiveNumbersCount);

        for (int i = 0; i < inputArray.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(inputArray));
    }
}