package AsociacionUnidreccional;

public class Student {

    private String name;
    private University associatedUniversity;

    public Student(String name, University associatedUniversity) {
        this.name = name;
        this.associatedUniversity = associatedUniversity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getAssociatedUniversity() {
        return associatedUniversity;
    }

    public void setAssociatedUniversity(University associatedUniversity) {
        this.associatedUniversity = associatedUniversity;
    }
}
