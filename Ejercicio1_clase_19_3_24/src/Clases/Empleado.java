package Clases;

public abstract class Empleado {
    protected String name;

    public Empleado(){

    }
    public Empleado(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Nombre: " + name;
    }
}
