package AsociacionUnidreccional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        University u1 = new University("Universidad Tecnologica Nacional");
        Student s1 = new Student("Pedro",u1);

        System.out.println("Alumno: " + s1.getName());
        System.out.println("Universidad: " + s1.getAssociatedUniversity().getName());

        System.out.print("Ingrese el cambio de universidad: ");
        String universityName = sc.nextLine();

        University u2 = new University(universityName);

        changeUniversity(s1,u2);

        System.out.println("Alumno: " + s1.getName());
        System.out.println("Universidad: " + s1.getAssociatedUniversity().getName());

    }

    public static void changeUniversity(Student s1, University u2){
        s1.setAssociatedUniversity(u2);
    }
}
