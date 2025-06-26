package com.elevatelab;

import main.java.com.elevatelab.Book;
import main.java.com.elevatelab.Library;
import main.java.com.elevatelab.User;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
       Book book1 = new Book(1, "Java", "Ankit");
       User user1 = new User(2, "Som");

       library.getBooks().add(book1);
       library.getUsers().add(user1);

       library.issueBook(1, 2);
    }
}