package Exercise8;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Pablo",35,4000F,true,"Contabilidad");
        Worker w1 = new Worker("Pedro",25,2500F,true, m1.getDepartament());
        System.out.println(m1.organizeActivities(m1.getDepartament(),"hacer recuento del dinero ingresado"));
        System.out.println("El encargado de " + m1.getDepartament() + " es " + m1.getName());
        System.out.println(w1.working() + " para " + m1.getName());

    }
}
