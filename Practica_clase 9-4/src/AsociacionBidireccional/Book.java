package AsociacionBidireccional;

import java.util.ArrayList;

public class Book {

    private String title;

    private ArrayList<Person> people = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addPeople(Person p1){
        people.add(p1);
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
