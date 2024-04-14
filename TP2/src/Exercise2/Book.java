package Exercise2;

public abstract class Book implements Loanable{

    protected String title;
    protected String author;
    protected int publicationYear;
    protected boolean borrowed;

    public Book(String title, String author, int publicationYear, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public void lend() {
        this.borrowed = true; //cuando un libro se presta, su estado cambia a true para indicar que está prestado
    }

    @Override
    public void giveBack() {
        this.borrowed = false;//cuando el libro se devuelve su estado cambia a false para indicar que ya no está prestado
    }
}
