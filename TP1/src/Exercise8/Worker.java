package Exercise8;

public class Worker extends Employee {
    public String workArea;

    public Worker(String name, int age, float salary, boolean workingCapacity, String workArea) {
        super(name, age, salary, workingCapacity);
        this.workArea = workArea;
    }

    public String getWorkArea() {
        return workArea;
    }

    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }

    public String working(){
        return this.name + " trabaja en " + this.workArea;
    }
}
