import java.util.ArrayList;

public class Campus {

    private int phase;
    private String date;
    private String hour;

    private ArrayList<Proof> itDoes = new ArrayList<>();
    private ArrayList<SportsFacilities> where = new ArrayList<>();

    public Campus(int phase, String date, String hour) {
        this.phase = phase;
        this.date = date;
        this.hour = hour;
    }

    public void addProofs(Proof p){
        itDoes.add(p);
    }

    public void addSportsFacilities(SportsFacilities sp){
        where.add(sp);
    }

    public ArrayList<Proof> getItDoes() {
        return itDoes;
    }

    public ArrayList<SportsFacilities> getWhere() {
        return where;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
