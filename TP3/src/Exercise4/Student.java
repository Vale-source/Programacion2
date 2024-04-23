package Exercise4;

public class Student {
    private String name;
    private int age;
    private double calification;

    public Student(String name, int age, double calification) {
        this.name = name;
        this.age = age;
        this.calification = calification;
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

    public double getCalification() {
        return calification;
    }

    public void setCalification(double calification) {
        this.calification = calification;
    }


}
