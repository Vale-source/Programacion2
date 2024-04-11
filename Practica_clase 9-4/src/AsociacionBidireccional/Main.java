package AsociacionBidireccional;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Pedro");
        Person p2 = new Person("Alfredo");
        Person p3 = new Person("Coco");
        Person p4 = new Person("Ramiro");

        Book b1 = new Book("Harry Potter");
        Book b2 = new Book("El Principito");
        Book b3 = new Book("Farenheit 451");


        p1.addBooks(b1);
        b1.addPeople(p1);

        p2.addBooks(b2);
        b2.addPeople(p2);

        p3.addBooks(b3);
        b3.addPeople(p3);

        p4.addBooks(b1);
        p4.addBooks(b2);
        p4.addBooks(b3);
        b1.addPeople(p4);
        b2.addPeople(p4);
        b3.addPeople(p4);


        Person[] people = {p1, p2, p3, p4};
        for (Person person : people) {
            System.out.println("Nombre: " + person.getName());
            System.out.print("Libros: ");
            for (Book book : person.getBooks()) {
                System.out.print(book.getTitle() + " ");
            }
            System.out.println();
            System.out.println("---------");
        }

        Book[] books = {b1,b2,b3};
        for (Book book: books){
            System.out.println("Titulo: " + book.getTitle());
            System.out.print("Propietarios: ");
            for (Person person: book.getPeople()){
                System.out.print(person.getName() + " ");
            }
            System.out.println();
            System.out.println("---------");
        }
    }
}
