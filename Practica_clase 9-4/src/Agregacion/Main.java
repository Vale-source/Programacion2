package Agregacion;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Valentin","Directivo");
        Employee e2 = new Employee("Rodrigo","Vice directivo");
        Employee e3 = new Employee("Ramiro","Ejecutivo");
        Employee e4 = new Employee("Nicolas","Personal de limpieza");

        Department d1 = new Department("Ventas");
        Department d2 = new Department("Fabrica");

        Company c1 = new Company("Dunder Mifflin Paper Company, Inc");

        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d2.addEmployee(e3);
        d2.addEmployee(e4);

        c1.addDepartaments(d1);
        c1.addDepartaments(d2);

        Company[] companies = {c1};

        for (Company c : companies){
            System.out.println("Compañia: " + c.getName());
            for (Department d : c.getDepartments()){
                System.out.println("Departamento: " + d.getName() );
                System.out.println("Empleados: ");
                for (Employee e: d.getEmployees()){
                    System.out.println(e.getName());
                }
                System.out.println("---------");
            }
        }

    }
}
