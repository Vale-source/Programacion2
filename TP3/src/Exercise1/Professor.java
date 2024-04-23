package Exercise1;

import java.util.ArrayList;

public class Professor extends Person{
    private String departament;
    private ArrayList<Subject> imparts = new ArrayList<>();

    public Professor(int dni, String name, String departament) {
        super(dni, name);
        this.departament = departament;
    }

    public void addSubject(Subject s){
        imparts.add(s);
    }

    public ArrayList<Subject> getImparts() {
        return imparts;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

}
