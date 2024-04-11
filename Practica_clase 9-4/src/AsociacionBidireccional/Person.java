package AsociacionBidireccional;

import java.util.ArrayList;

public class Person {

    private String name;

    private ArrayList<Book> books = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void addBooks(Book b1){
        books.add(b1);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
