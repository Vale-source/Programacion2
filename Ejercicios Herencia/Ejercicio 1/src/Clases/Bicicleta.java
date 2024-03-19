package Clases;

public class Bicicleta extends Vehiculo {
    private String type;

    public Bicicleta() {

    }


    public Bicicleta(String color, int wheels, String type) {
        super(color, wheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
