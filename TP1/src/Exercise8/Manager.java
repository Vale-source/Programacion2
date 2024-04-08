package Exercise8;

public class Manager extends Employee{
    private String departament;

    public Manager(String name, int age, float salary, boolean workingCapacity, String departament) {
        super(name, age, salary, workingCapacity);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String organizeActivities(String departament,String activity){
        return "El departamento de " + departament + " se encarga de " + activity;
    }
}
