package Clases;

public class Motocicleta extends Bicicleta {
    private float velocity;
    private float displacement;

    public Motocicleta(){

    }

    public Motocicleta(String color, int wheels, String type, float velocity, float displacement) {
        super(color, wheels, type);
        this.velocity = velocity;
        this.displacement = displacement;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }
}
