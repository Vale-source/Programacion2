import java.util.ArrayList;

public class NationalTeam {

    private String color;
    private String country;

    private ArrayList<Athlete> belongs = new ArrayList<>();

    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
    }

    public void addAthlete(Athlete a){
        belongs.add(a);
    }

    public ArrayList<Athlete> getBelongs() {
        return belongs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
