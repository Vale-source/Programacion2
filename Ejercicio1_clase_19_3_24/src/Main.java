import Clases.*;

public class Main {
    public static void main(String[] args) {
        Operario op = new Operario("Juan",8,1000);
        Oficial of = new Oficial("Pedro",8,800,4);
        Directivo dt = new Directivo("Roberto",1234);
        Tecnico tec = new Tecnico("Alfonso",4,500,"mantenimiento");


        System.out.println(of.toString());
        System.out.println(op.toString());
        System.out.println(dt.toString());
        System.out.println(tec.toString());

        System.out.println("El sueldo de " + op.getName() + " es: "+op.balance());

        if (of.good_worker() == true){
            System.out.println("Este opreario trabaja correctamente");
        } else {
            System.out.println("Este operario es un vago");
        }
        System.out.println(dt.antiquity());

        System.out.println(tec.social_work());



    }
}
