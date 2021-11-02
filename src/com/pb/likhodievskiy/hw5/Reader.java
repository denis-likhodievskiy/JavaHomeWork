package com.pb.likhodievskiy.hw5;

class Reader {

    private String fio;
    private int cardId;
    private String faculty;
    private String birthday;
    private String phone;

    public Reader(String fio, int cardId, String faculty, String birthday, String phone) {
        this.fio = fio;
        this.cardId = cardId;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int bookCount) {
        System.out.println(fio + " took " + bookCount + " " + (bookCount > 1 ? "books" : "book"));
    }

    public void takeBook(String... bookNames) {
        StringBuilder result = new StringBuilder();

        result.append(fio);
        result.append(" took the books: ");
        for (var i = 0; i < bookNames.length; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(bookNames[i]);
        }

        System.out.println(result.toString());
    }

    public void takeBook(Book... books) {
        StringBuilder result = new StringBuilder();

        result.append(fio);
        result.append(" took the books: ");
        for (var i = 0; i < books.length; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(books[i].toString());
        }

        System.out.println(result.toString());
    }

    public void returnBook(int bookCount) {
        System.out.println(fio + " returned " + bookCount + " " + (bookCount > 1 ? "books" : "book"));
    }

    public void returnBook(String... bookNames) {
        StringBuilder result = new StringBuilder();

        result.append(fio);
        result.append(" returned the books: ");
        for (var i = 0; i < bookNames.length; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(bookNames[i]);
        }

        System.out.println(result.toString());
    }

    public void returnBook(Book... books) {
        StringBuilder result = new StringBuilder();

        result.append(fio);
        result.append(" returned the books: ");
        for (var i = 0; i < books.length; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(books[i].toString());
        }

        System.out.println(result.toString());
    }

    public String toString() {
        return "cardId: " + cardId + ", fio: " + fio + ", birthday: " + birthday + ", faculty: " + faculty + ", phone: " + phone;
    }
}