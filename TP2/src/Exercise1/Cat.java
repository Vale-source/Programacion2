package Exercise1;

public class Cat extends Animal{

    private String race;
    private boolean sterilized;

    public Cat(int age, String name, int price, String typeAnimal, String race, boolean sterilized) {
        super(age, name, price, typeAnimal);
        this.race = race;
        this.sterilized = sterilized;
    }

    @Override
    public void feed(String name) {
        System.out.println(this.name + " ha sido alimentado con Whiskas");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    @Override
    public String toString() {

        return  "Raza: " + race +
                "\nEsterilizado: " + sterilized +
                "\nEdad: " + age + " años" +
                "\nNombre: '" + name +
                "\nPrecio: " + price +
                "\nAnimal: " + typeAnimal;
    }
}
