package Ejercicio1;

public class Cuadrado implements Figura, Rotable, Dibujable{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public String dibujar() {
        return "Esta figura se puede dibujar";
    }

    @Override
    public String rotar() {
        return "Esta figura se puede rotar";
    }
}
