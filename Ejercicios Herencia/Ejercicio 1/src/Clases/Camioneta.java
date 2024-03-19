package Clases;

public class Camioneta extends Coche{
    private float load;

    public Camioneta(){

    }

    public Camioneta(String color, int wheels, float car_velocity, float car_displacement, float load) {
        super(color, wheels, car_velocity, car_displacement);
        this.load = load;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }
}
