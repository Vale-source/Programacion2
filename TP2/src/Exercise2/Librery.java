package Exercise2;

import java.util.ArrayList;

public class Librery {
    private ArrayList<Book> books;

    public Librery() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void seeBooks() {
        for (Book b : books) {
            if (!b.isBorrowed()) {
                System.out.println(b.getTitle());
            }
        }
    }

    public void lendBook(String title, String author) {
        boolean bookFound = false;
        for (Book b : books) {
            if (title.equals(b.getTitle()) && author.equals(b.getAuthor())) {
                bookFound = true;
                if (!b.isBorrowed()) {
                    System.out.println(b.getTitle() + ": " + b.isBorrowed() + " (esta disponible)");
                    b.lend();
                    System.out.println(b.getTitle() + " acaba de ser prestado");
                    break;
                } else {
                    System.out.println(b.getTitle() + ": " + b.isBorrowed() + " (no esta disponible)");
                }
            }
        }
        if (!bookFound) {
            System.out.println("La biblioteca no tiene ese libro");
        }
    }

    public void giveBackBook(String title, String author) {
        boolean bookFound = false;
        for (Book b : books) {
            if (title.equals(b.getTitle()) && author.equals(b.getAuthor())) {
                bookFound = true;
                if (b.isBorrowed()) {
                    System.out.println(b.getTitle() + " Fue prestado");
                    b.giveBack();
                    System.out.println(b.getTitle() + " acaba de ser devuelto");
                }
            }
        }
        if (!bookFound) {
            System.out.println("La biblioteca no tiene ese libro");
        }
    }
}
