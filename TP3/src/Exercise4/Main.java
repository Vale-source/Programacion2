package Exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int output = 0;
        while (output == 0) {
                System.out.println("Registro de alumnos:");

                System.out.println("1. Agregar estudiante");
                System.out.println("2. Mostrar estudiantes");
                System.out.println("3. Calcular promedio de notas");
                System.out.println("4. Nota mas grande");
                System.out.println("5. Buscar alumno");
                System.out.println("6. Salir");
                System.out.println("Elija su opcion");

                String optionStr = sc.next();

                try {
                    int option = Integer.parseInt(optionStr);

                    switch (option) {

                        case 1:
                            String name;
                            String age;
                            String calification;

                            while (true) {
                                System.out.print("Ingrese el nombre: ");
                                name = sc.next().toLowerCase();
                                if (name.matches("[a-zA-Z]+")) {
                                    break;
                                } else {
                                    System.out.println("Nombre no válido. Ingrese solo letras.");
                                }
                            }


                            while (true) {
                                System.out.print("Ingrese la edad: ");
                                age = sc.next();
                                if (age.matches("[5-9]|1\\d|2[0-9]|30")) { //Suponiendo que es un sistema que se puede aplicar a primaria, secundaria y facultad
                                    break;
                                } else {
                                    System.out.println("Ingrese una edad valida");
                                }
                            }
                            int ageInt = Integer.parseInt(age);

                            while (true) {
                                System.out.println("Ingrese su calificacion: ");
                                calification = sc.next();
                                if (calification.matches("[1-9]|10")){
                                    break;
                                } else {
                                    System.out.println("Ingrese una nota valida");
                                }
                            }

                            double calificationDouble = Double.parseDouble(calification);

                            addStudent(students, name, ageInt, calificationDouble);
                            break;

                        case 2:
                            System.out.println("Estudiantes: ");
                            showStudents(students);
                            break;

                        case 3:
                            System.out.println("El promedio de notas es: " + calculateMedia(students));
                            break;

                        case 4:
                            showBiggerNote(students);
                            break;

                        case 5:
                            System.out.print("Ingrese el nombre del estudiante a buscar: ");
                            String searchName = sc.next().toLowerCase();
                            searchStudent(students, searchName);

                            break;

                        case 6:
                            output = 1;

                        default:
                            System.out.println("Ingrese un numero valido");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un número válido como opción.");
                }
            }
        }

    public static void addStudent(ArrayList<Student> students, String name, int age, double calification){
        Student newStudent = new Student(name, age, calification);
        students.add(newStudent);
    }

    public static void showStudents(ArrayList<Student> students){
        for (Student s : students){
            System.out.println("Nombre: " + s.getName() + "\nEdad: " + s.getAge() + "\nNota: " + s.getCalification());
        }
    }

    public static double calculateMedia(ArrayList<Student> students){
        double addition = 0;
        for (Student s : students){
            addition += s.getCalification();
        }

        double media = addition/ students.size();

        return media;
    }

    public static void showBiggerNote(ArrayList<Student> students){
        double biggerNote = 0;
        String name = "";
        for (Student s : students){
            if (s.getCalification() >= biggerNote){
                biggerNote = s.getCalification();
                name = s.getName();
            }
        }
        System.out.println("El alumno con mayor nota es " + name + " con una nota de: " + biggerNote );
    }

    public static void searchStudent(ArrayList<Student> students, String name) {
        boolean found = false;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                System.out.println("Alumno encontrado: " + "\nNombre: " + s.getName() + "\nEdad: " + s.getAge() + "\nNota: " + s.getCalification());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Alumno no encontrado");
        }
    }
}
