package Exercise10;

public class TextBook extends Book{
    protected String curse;

    public TextBook(String title, String author, float price, String curse) {
        super(title, author, price);
        this.curse = curse;
    }

    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    @Override
    public String print(){
        return "Titulo: " + title + "\n" +
                "Autor: " + author + "\n" +
                "Precio: " + price + "\n" +
                "Curso: " + curse;
    }
}
