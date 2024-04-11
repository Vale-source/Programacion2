package Composicion;

import java.util.ArrayList;

public class House {

    private String name;
    private ArrayList<Door> doors;

    public House(String name) {
        this.name = name;
        this.doors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDoor(Door d){
        doors.add(d);
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

}
