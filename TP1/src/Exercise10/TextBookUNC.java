package Exercise10;

public class TextBookUNC extends TextBook{
    private String faculty;

    public TextBookUNC(String title, String author, float price, String curse, String faculty) {
        super(title, author, price, curse);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String print(){
        return "Titulo: " + title + "\n" +
                "Autor: " + author + "\n" +
                "Precio: " + price + "\n" +
                "Curso: " + curse + "\n" +
                "Facultad: " + faculty;
    }
}
