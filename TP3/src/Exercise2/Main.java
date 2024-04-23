package Exercise2;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pedro");
        Employee e2 = new Employee("Roberto");

        e2.addSupervisor(e1);
        System.out.println("El supervisor de " + e2.getName() + " es: " + e2.getSupervisorName());

        System.out.println("El supervisor de " + e1.getName() + " es: " + e1.getSupervisorName());
    }

}
