package Exercise2;

public class Academic extends Book {
    private String area;

    public Academic(String title, String author, int publicationYear, boolean borrowed, String area) {
        super(title, author, publicationYear, borrowed);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
