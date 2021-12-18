package com.pb.likhodievskiy.hw11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class PhoneBookItem implements Serializable {

    private final String fio;
    private final String birthday;
    private final ArrayList<String> phones;
    private final Date dateMd;

    public PhoneBookItem(String fio, String birthday, String... phones) {
        this.fio = fio;
        this.birthday = birthday;
        this.phones = new ArrayList<>();
        this.phones.addAll(Arrays.asList(phones));
        this.dateMd = new Date();
    }

    public String getFio() {
        return fio;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean contains(String searchValue) {
        return fio.equals(searchValue) || birthday.equals(searchValue) || phones.contains(searchValue);
    }

    @Override
    public String toString() {
        StringBuilder phonesStr = new StringBuilder();
        for (var i = 0; i < phones.size(); i++) {
            if (i > 0) {
                phonesStr.append(',');
            }
            phonesStr.append('"');
            phonesStr.append(phones.get(i));
            phonesStr.append('"');
        }

        return "{\"fio\": \"" + fio + "\", \"birthday\": \"" + birthday + "\", \"phones\": [" + phonesStr + "], \"dateMd\": \"" + dateMd + "\"}";
    }
}