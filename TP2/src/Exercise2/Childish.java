package Exercise2;

public class Childish extends Book{

    private String necessaryAge;

    public Childish(String title, String author, int publicationYear, boolean borrowed, String necessaryAge) {
        super(title, author, publicationYear, borrowed);
        this.necessaryAge = necessaryAge;
    }

    public String getNecessaryAge() {
        return necessaryAge;
    }

    public void setNecessaryAge(String necessaryAge) {
        this.necessaryAge = necessaryAge;
    }
}
