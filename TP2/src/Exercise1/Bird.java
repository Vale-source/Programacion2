package Exercise1;

public class Bird extends Animal{
    private String species;
    private boolean talk;

    public Bird(int age, String name, int price, String typeAnimal, String species, boolean talk) {
        super(age, name, price, typeAnimal);
        this.species = species;
        this.talk = talk;
    }

    @Override
    public void feed(String name) {
        System.out.println(this.name + " ha sido alimentado con Chirp Blend");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isTalk() {
        return talk;
    }

    public void setTalk(boolean talk) {
        this.talk = talk;
    }

    @Override
    public String toString() {
        return  "Especie: " + species +
                "\nHabla: " + talk +
                "\nEdad: " + age + " años" +
                "\nNombre: '" + name +
                "\nPrecio: " + price +
                "\nAnimal: " + typeAnimal;
    }
}
