package com.pb.likhodievskiy.hw12;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook {
    public static void main(String[] args) {
        List<PhoneBookItem> phoneBookList = Arrays.asList(
                new PhoneBookItem("Petrov V.V.", "10.10.1989", "050 000 00 00", "050 000 00 01"),
                new PhoneBookItem("Kuznetsov S.D.", "05.03.1993", "093 000 00 00", "050 000 00 03"),
                new PhoneBookItem("Sokolov E.I.", "08.08.1988", "097 000 00 00")
        );

        System.out.println("----------------------------------------");
        System.out.println("Phone book list:");
        phoneBookList.forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Phone book list after remove Kuznetsov S.D.:");
        phoneBookList = phoneBookList.stream()
                .filter(item -> !item.contains("Kuznetsov S.D."))
                .collect(Collectors.toList());
        phoneBookList.forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Search:");
        phoneBookList
                .stream()
                .filter(item -> item.contains("Sokolov E.I."))
                .limit(1)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Phone book sorted by fio:");
        phoneBookList
                .stream()
                .sorted(Comparator.comparing(PhoneBookItem::getFio))
                .forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Phone book sorted by birthday:");
        phoneBookList
                .stream()
                .sorted(Comparator.comparing(PhoneBookItem::getBirthday))
                .forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Phone book list after edit:");
        phoneBookList.set(0, new PhoneBookItem("Ivanov I.I.", "08.09.1988", "066 000 00 00"));
        phoneBookList.forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Write contacts.txt file");
        try (
                FileOutputStream outputStream = new FileOutputStream("contacts.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)
        ) {
            objectOutputStream.writeObject(phoneBookList);

            System.out.println("----------------------------------------");
            System.out.println("Read contacts.txt file");
            try (
                    FileInputStream inputStream = new FileInputStream("contacts.txt");
                    ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)
            ) {
                phoneBookList = (List<PhoneBookItem>)objectInputStream.readObject();
                phoneBookList.forEach(System.out::println);
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}