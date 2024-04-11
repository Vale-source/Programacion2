package Agregacion;

import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addDepartaments(Department d){
        departments.add(d);
    }
}
