package Exercise1;
import java.util.ArrayList;

public class PetShop {
    private ArrayList<Animal> animals = new ArrayList<>();

    public PetShop() {

    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void feedAnimal(String name){
        for (Animal a : animals){
            if (name.equals(a.getName())){
                a.feed(name);
            }
        }
    }

    public void sellAnimal(String name){
        for (Animal a : animals){
            if (name.equals(a.getName())){
                System.out.println(a.getName() + " vendido\n" + " Animal: " + a.getTypeAnimal() + "\n" +" Por el precio de $" + a.getPrice());
                animals.remove(a);
                break;
            }
        }
    }

    public void seeList(){
        for (Animal a :  animals){
            System.out.println(a.toString());
            System.out.println();
        }
    }

    


}
