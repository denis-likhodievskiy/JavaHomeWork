package com.pb.likhodievskiy.hw11;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneBookList implements Serializable {

    private List<PhoneBookItem> list;

    public PhoneBookList() {
        this.list = new ArrayList<>();
    }

    public PhoneBookList(List<PhoneBookItem> list) {
        this();
        this.list.addAll(list);
    }

    public void add(PhoneBookItem phoneBookItem) {
        this.list.add(phoneBookItem);
    }

    public PhoneBookItem edit(int index, PhoneBookItem phoneBookItem) {
        return this.list.set(index, phoneBookItem);
    }

    public void remove(PhoneBookItem phoneBookItem) {
        this.list.remove(phoneBookItem);
    }

    public PhoneBookItem search(String searchValue) {
        PhoneBookItem result = null;
        for (PhoneBookItem item: this.list) {
            if (item.contains(searchValue)) {
                result = item;
                break;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public String toString(String sortedField) {
        if (sortedField.equals("fio") || sortedField.equals("birthday")) {
            Collections.sort(list, new Comparator<PhoneBookItem>() {
                public int compare(PhoneBookItem a, PhoneBookItem b) {
                    if (sortedField.equals("fio")) {
                        return a.getFio().compareTo(b.getFio());
                    } else {
                        return a.getBirthday().compareTo(b.getBirthday());
                    }
                }
            });
        }

        return list.toString();
    }

    public void writeToFile(String fileName) throws IOException {
        File file = Paths.get(fileName).toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        outputStream.close();
    }

    public void readFromFile(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        list = (List<PhoneBookItem>)objectInputStream.readObject();
    }
}