package Exercise2;

public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int publicationYear, boolean borrowed, String genre) {
        super(title, author, publicationYear, borrowed);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
