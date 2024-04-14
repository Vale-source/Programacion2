package Exercise1;

public class Dog extends Animal{
    private String race;
    private boolean vaccinated;

    public Dog(int age, String name, int price, String typeAnimal, String race, boolean vaccinated) {
        super(age, name, price, typeAnimal);
        this.race = race;
        this.vaccinated = vaccinated;
    }

    @Override
    public void feed(String name) {
        System.out.println(this.name + " ha sido alimentado con Dog Chow");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Raza: " + race +
                "\nVacunado: " + vaccinated +
                "\nEdad: " + age + " años" +
                "\nNombre: '" + name +
                "\nPrecio: " + price +
                "\nAnimal: " + typeAnimal;
    }
}
