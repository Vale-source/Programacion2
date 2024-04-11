package Agregacion;

import java.util.ArrayList;

public class Department {

    private ArrayList<Employee> employees = new ArrayList<>();

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
