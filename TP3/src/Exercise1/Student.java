package Exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Person{

    private ArrayList<Group> groupToStay = new ArrayList<>();

    public Student(int dni, String name) {
        super(dni, name);
    }

    public void addGroup(Group g){
        groupToStay.add(g);
    }

    public ArrayList<Group> getGroupToStay() {
        return groupToStay;
    }
}
