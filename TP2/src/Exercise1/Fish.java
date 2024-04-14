package Exercise1;

public class Fish extends Animal{

    private String species;
    private int timeLife;

    public Fish(int age, String name, int price, String typeAnimal, String species, int timeLife) {
        super(age, name, price, typeAnimal);
        this.species = species;
        this.timeLife = timeLife;
    }

    @Override
    public void feed(String name) {
        System.out.println(this.name + " ha sido alimentado con Escamas Shulet Carassius");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getTimeLife() {
        return timeLife;
    }

    public void setTimeLife(int timeLife) {
        this.timeLife = timeLife;
    }

    @Override
    public String toString() {
        return  "Especie: " + species +
                "\nTiempo de vida: " + timeLife + " años" +
                "\nEdad: " + age + " años" +
                "\nNombre: '" + name +
                "\nPrecio: " + price +
                "\nAnimal: " + typeAnimal;
    }
}
