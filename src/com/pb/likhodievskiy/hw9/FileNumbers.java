package com.pb.likhodievskiy.hw9;

import java.io.FileWriter;
import java.io.Writer;
import java.io.File;
import java.util.Scanner;

public class FileNumbers {

    public static void main(String[] args) {
        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() {
        System.out.println("Create numbers.txt");

        final byte LINE_COUNT = 10;
        final byte NUMBER_COUNT = 10;

        try (Writer writer = new FileWriter("numbers.txt")) {
            for (int i = 0; i < LINE_COUNT; i++) {
                for (int j = 0; j < NUMBER_COUNT; j++) {
                    writer.write((j > 0 ? " " : "") + (1 + (int) (100 * Math.random())));
                }
                if (i < LINE_COUNT - 1) {
                    writer.write("\n");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
    }

    public static void createOddNumbersFile() {
        System.out.println("Create odd-numbers.txt");

        try (
                Scanner scanner = new Scanner(new File("numbers.txt"));
                Writer writer = new FileWriter("odd-numbers.txt")
        ) {
            while (scanner.hasNextLine()) {
                String[] strArray = scanner.nextLine().split(" ");

                for (int i = 0; i < strArray.length; i++) {
                    int ch = Integer.parseInt(strArray[i]);
                    writer.write((i > 0 ? " " : "") + (ch % 2 == 0 ? 0 : ch));
                }
                writer.write("\n");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
    }
}