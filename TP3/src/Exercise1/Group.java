package Exercise1;

import java.util.ArrayList;

public class Group{
    private String course;
    private char letter;
    public ArrayList<Student> belongs;
    public ArrayList<Subject> receives = new ArrayList<>();

    public Group(String course, char letter) {
        this.course = course;
        this.letter = letter;
        this.belongs = new ArrayList<>();
    }

    public void addSubject(Subject s){
        receives.add(s);
    }

    public ArrayList<Subject> getReceives() {
        return receives;
    }

    public void addStudent(Student s){
        belongs.add(s);
    }

    public ArrayList<Student> getBelongs() {
        return belongs;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }


}
