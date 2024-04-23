package Exercise2;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSupervisor(Employee supervisor){
        this.supervisor = supervisor;
    }

    public String getSupervisorName(){
        if (this.supervisor != null){
            return supervisor.getName();
        }else {
            return "no tiene supervisor";
        }
    }
}
