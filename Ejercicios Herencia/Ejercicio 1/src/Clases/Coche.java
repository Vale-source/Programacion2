package Clases;

public class Coche extends Vehiculo{
    private float car_velocity;
    private float car_displacement;

    public Coche(){

    }

    public Coche(String color, int wheels, float car_velocity, float car_displacement) {
        super(color, wheels);
        this.car_velocity = car_velocity;
        this.car_displacement = car_displacement;
    }

    public float getCar_velocity() {
        return car_velocity;
    }

    public void setCar_velocity(float car_velocity) {
        this.car_velocity = car_velocity;
    }

    public float getCar_displacement() {
        return car_displacement;
    }

    public void setCar_displacement(float car_displacement) {
        this.car_displacement = car_displacement;
    }
}
