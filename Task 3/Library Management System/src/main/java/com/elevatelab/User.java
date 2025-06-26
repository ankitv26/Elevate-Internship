package main.java.com.elevatelab;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Book> issuedBook;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.issuedBook = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getIssuedBook() {
        return issuedBook;
    }

    public void setIssuedBook(List<Book> issuedBook) {
        this.issuedBook = issuedBook;
    }

    public void issueBook(Book book) {
        issuedBook.add(book);
    }

    public void returnBook(Book book) {
        issuedBook.remove(book);
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", issuedBook=" + issuedBook + "]";
    }

}
