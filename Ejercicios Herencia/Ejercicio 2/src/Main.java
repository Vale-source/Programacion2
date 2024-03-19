import Clases.*;

public class Main {
    public static void main(String[] args) {
        Perro dog = new Perro("India","Femenino",6,"Beagle");
        Gato cat = new Gato("Michi","Masculino",5,"Bengala");
        Loro parrot = new Loro("Pedro","Masculino",3,"Verde");

        dog.informacion();
        dog.hacer_sonido();

        System.out.println("\n");

        cat.informacion();
        cat.hacer_sonido();

        System.out.println("\n");

        parrot.informacion();
        parrot.hacer_sonido();
    }
}
