package com.pb.likhodievskiy.hw5;

class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Adventures", "Ivanov I.I.", 2000);
        Book book2 = new Book("Dictionary", "Sidorov A.V.", 1980);
        Book book3 = new Book("Encyclopedia", "Gusev K.V.", 2010);

        Book[] books = {book1, book2, book3};

        Reader user1 = new Reader("Petrov V.V.", 10000, "Mechanics and Mathematics", "10.10.1989", "050 000 00 00");
        Reader user2 = new Reader("Kuznetsov S.D.", 10001, "History", "05.03.1993", "093 000 00 00");
        Reader user3 = new Reader("Sokolov E.I.", 10002, "Applied Mathematics", "08.08.1988", "097 000 00 00");

        Reader[] users = {user1, user2, user3};

        System.out.println("Book List:");
        for (Book book : books) {
            System.out.println("- " + book.toString());
        }

        System.out.println("User List:");
        for (Reader user : users) {
            System.out.println("- " + user.toString());
        }

        user1.takeBook(3);
        user1.takeBook("Adventures", "Dictionary", "Encyclopedia");
        user1.takeBook(book1, book2, book3);

        user1.returnBook(3);
        user1.returnBook("Adventures", "Dictionary", "Encyclopedia");
        user1.returnBook(book1, book2, book3);
    }
}