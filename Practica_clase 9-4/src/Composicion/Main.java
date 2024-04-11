package Composicion;

public class Main {
    public static void main(String[] args) {
        Door d1 = new Door("Roble");
        Door d2 = new Door("Roble");
        Door d3 = new Door("Metal");
        Door d4 = new Door("Algarrobo");
        Door d5 = new Door("Algarrobo");

        House h1 = new House("Descanso en el Alba");
        h1.addDoor(d1);
        h1.addDoor(d2);
        h1.addDoor(d3);
        h1.addDoor(d4);
        h1.addDoor(d5);

        Door d6 = new Door("Metal");
        Door d7 = new Door("Metal");
        Door d8 = new Door("Metal");

        House h2 = new House("De paso");
        h2.addDoor(d6);
        h2.addDoor(d7);
        h2.addDoor(d8);


        House[] houses = {h1,h2};
        for (House h : houses){
            System.out.println("Casa: " + h.getName());
            System.out.println("Materiales de las puertas: ");
            for (Door d : h.getDoors()){
                System.out.println(d.getMaterial());
            }
            System.out.println("----------");
        }
    }
}
