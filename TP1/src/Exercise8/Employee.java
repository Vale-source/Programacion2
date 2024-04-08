package Exercise8;

public abstract class Employee {
    protected String name;
    protected int age;
    protected float salary;
    protected boolean workingCapacity;

    public Employee(String name, int age, float salary, boolean workingCapacity) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workingCapacity = workingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isWorkingCapacity() {
        return workingCapacity;
    }

    public void setWorkingCapacity(boolean workingCapacity) {
        this.workingCapacity = workingCapacity;
    }
}
