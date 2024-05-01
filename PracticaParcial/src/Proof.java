import java.util.ArrayList;

public class Proof {
    private int code;
    private String title;

    private ArrayList<Athlete> participate = new ArrayList<>();

    public Proof(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public void addParticipant(Athlete a){
        participate.add(a);
    }

    public ArrayList<Athlete> getParticipate() {
        return participate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
