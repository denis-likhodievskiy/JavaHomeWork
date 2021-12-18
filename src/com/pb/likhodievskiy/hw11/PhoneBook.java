package com.pb.likhodievskiy.hw11;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBookList phoneBookList = new PhoneBookList();
        PhoneBookItem phoneBookItem1 = new PhoneBookItem("Petrov V.V.", "10.10.1989", "050 000 00 00", "050 000 00 01");
        PhoneBookItem phoneBookItem2 = new PhoneBookItem("Kuznetsov S.D.", "05.03.1993", "093 000 00 00", "050 000 00 03");
        PhoneBookItem phoneBookItem3 = new PhoneBookItem("Sokolov E.I.", "08.08.1988", "097 000 00 00");

        phoneBookList.add(phoneBookItem1);
        phoneBookList.add(phoneBookItem2);
        phoneBookList.add(phoneBookItem3);
        System.out.println(phoneBookList);

        phoneBookList.remove(phoneBookItem2);
        System.out.println(phoneBookList);

        System.out.println(phoneBookList.search("Sokolov E.I."));

        System.out.println("Phone book sorted by fio: " + phoneBookList.toString("fio"));
        System.out.println("Phone book sorted by birthday: " + phoneBookList.toString("birthday"));

        phoneBookList.edit(0, new PhoneBookItem("Ivanov I.I.", "08.09.1988", "066 000 00 00"));
        System.out.println(phoneBookList);

        try {
            System.out.println("Write contacts.txt file");
            phoneBookList.writeToFile("contacts.txt");

            try {
                System.out.println("Read contacts.txt file");
                phoneBookList.readFromFile("contacts.txt");
                System.out.println(phoneBookList);
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}