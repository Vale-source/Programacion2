package Exercise10;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, float price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String print(){
        return "Titulo: " + title + "\n" +
                "Autor: " + author + "\n" +
                "Precio: " + price + "\n" +
                "Genero: " + genre;
    }
}
