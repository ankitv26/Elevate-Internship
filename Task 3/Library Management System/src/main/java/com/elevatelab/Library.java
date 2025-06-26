package main.java.com.elevatelab;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;
    List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String addBook(Book book) {
        books.add(book);
        return " Book added";
    }

    public String addUser(User user) {
        users.add(user);
        return "user added";
    }

    public boolean issueBook(int bookId, int userId) {
        Book bookToIssue = null;
        User issuingUser = null;

        for (Book book : books) {
            if (book.getId() == bookId) {
                bookToIssue = book;
                break;
            }
        }

        for (User user : users) {
            if (user.getId() == userId) {
                issuingUser = user;
                break;
            }
        }

        if(bookToIssue == null || issuingUser == null){
            System.out.println("Book or User not found");
            return false;
        }

        if(bookToIssue.isIssued()){
            System.out.println("Book already issued.");
            return false;
        }

        bookToIssue.setIsIssued(true);
        issuingUser.issueBook(bookToIssue);
        System.out.println("Book issued successfully.");
        return true;
         

    }
}
