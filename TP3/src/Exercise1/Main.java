package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Group g1 = new Group("1PROG",'3');
        Group g2 = new Group("1PROG",'1');
        Group g3 = new Group("1PROG",'4');

        Student s1 = new Student(44771675,"Valentin");
        Student s2 = new Student(44698554,"Rodrigo");
        Student s3 = new Student(45783662,"Mercedes");
        Student s4 = new Student(43875124,"Ramiro");
        Student s5 = new Student(45126325,"Nicolas");

        g1.addStudent(s1);
        g2.addStudent(s1);
        g3.addStudent(s1);

        g1.addStudent(s2);
        g1.addStudent(s3);
        g1.addStudent(s4);
        g1.addStudent(s5);


        s1.addGroup(g1);
        s1.addGroup(g2);
        s1.addGroup(g3);

        s2.addGroup(g1);
        s3.addGroup(g1);
        s4.addGroup(g1);
        s5.addGroup(g1);


        Subject sub1 = new Subject(4,"11:00","programacion 2");
        Subject sub2 = new Subject(3,"8:00","laboratorio 2");
        Subject sub3 = new Subject(2,"9:30","estadistica");
        Subject sub4 = new Subject(1, "10:30", "algebra");
        Subject sub5 = new Subject(6, "16:45", "analisis matematico");

        sub1.addGroup(g1);
        g1.addSubject(sub1);

        g1.addSubject(sub4);
        sub4.addGroup(g1);

        Professor p1 = new Professor(38561247,"Pedro","Matematicas");
        Professor p2 = new Professor(32198746,"Raul","Ingenieria");
        Professor p3 = new Professor(18695841,"Jorge","Computacion");

        p1.addSubject(sub3);
        p1.addSubject(sub4);
        p1.addSubject(sub5);
        sub3.addProfessor(p1);
        sub4.addProfessor(p1);
        sub5.addProfessor(p1);


        p2.addSubject(sub2);
        sub2.addProfessor(p2);

        p3.addSubject(sub1);
        sub1.addProfessor(p3);

        System.out.println("Ejercicio A");
        int index = 0;
        for (Subject s : p1.getImparts()){
            if (index == 2){
                System.out.println("El curso de la tercera materia es: " + s.getClassroom());
                break;
            }
            index++;
        }
        System.out.println();

        System.out.println("Ejercicio B");
        System.out.println("Las materias que da el profesor " + p1.getName() + " son: " );
        for (Subject s : p1.getImparts()){
            System.out.println(s.getName());
        }
        System.out.println();


        System.out.println("Ejercicio C");
        for (Subject s : g1.getReceives()) {
            if (s.getGroup() != null){
                System.out.println("Materia: " + s.getName());
                System.out.println("Curso que la recibe: " + s.getGroup().getCourse() + s.getGroup().getLetter());
                for (Student student : s.getGroup().getBelongs()) {
                    System.out.println("Alumno: " + student.getName() + "\nDNI: " + student.getDni());
                }
                System.out.println();

            } else {
                System.out.println("Esta materia aun no tiene grupo asignado");
            }
        }
        System.out.println();

        System.out.println("Ejercicio D");
        for (int i = 0; i < s1.getGroupToStay().size(); i++) {
            if (i == 2){
                System.out.println("Alumno: " + s1.getName());
                System.out.println("Letra del 3er grupo al que pertenece: " + s1.getGroupToStay().get(i).getLetter());
                break;
            }
        }
        System.out.println();


        System.out.println("Ejercicio E");
        for (int i = 0; i < s1.getGroupToStay().size(); i++) {
            System.out.println("Alumno: " + s1.getName() + "\n1er grupo al que pertenece: " + s1.getGroupToStay().get(i).getCourse() + s1.getGroupToStay().get(i).getLetter()) ;
            if (i == 0){
                for (int j = 0; j < s1.getGroupToStay().get(i).getReceives().size(); j++) {
                    System.out.println(s1.getGroupToStay().get(i).getReceives().get(j).getName());
                }
                break;
            }
        }
        System.out.println();


        System.out.println("Ejercicio F");
        System.out.println("Ingrese una asignatura existente: ");
        String putSignature = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Group g : s1.getGroupToStay()){ //Para imprimir resultados, colocar Programacion 2 o Algebra
            for (Subject s : g.getReceives()){
                if (s.getName().equals(putSignature)){
                    found = true;
                    System.out.println("El profesor que da la materia de " + s.getName() + " es: " + s.getProfessor().getName());
                }
            }
        }
        if (!found) {
            System.out.println("La asignatura ingresada no se encontró en el grupo correspondiente.");
        }

        System.out.println();


        System.out.println("Ejercicio G");
        for (int i = 0; i < p1.getImparts().size(); i++) {
            if (i == 1){
                System.out.println("Materia: " + p1.getImparts().get(i).getName());
                System.out.println("Grupo: " + p1.getImparts().get(i).getGroup().getCourse() + p1.getImparts().get(i).getGroup().getLetter() );
                System.out.println("Alumnos: ");
                for (int j = 0; j < p1.getImparts().get(i).getGroup().getBelongs().size(); j++) {
                    System.out.println(p1.getImparts().get(i).getGroup().getBelongs().get(j).getName());
                }
            }
        }
    }

}