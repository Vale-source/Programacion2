package Exercise1;

public class Main {
    public static void main(String[] args) {
        PetShop petShop1 = new PetShop();
        Dog beagle = new Dog(1,"India",200000,"Perro","Beagle",true);
        Cat siames = new Cat(2,"Manchita",240000,"Gato","Siames",false);
        Bird loro = new Bird(3,"Pepito",160000,"Pajaro","Loro",true);
        Fish oranda = new Fish(4,"Alfred",130000,"Pez","Oranda",5);

        petShop1.addAnimal(beagle);
        petShop1.addAnimal(siames);
        petShop1.addAnimal(loro);
        petShop1.addAnimal(oranda);

        petShop1.seeList();
        System.out.println();
        petShop1.feedAnimal("India");
        petShop1.sellAnimal("Manchita");
        System.out.println();
        petShop1.seeList();
    }
}
