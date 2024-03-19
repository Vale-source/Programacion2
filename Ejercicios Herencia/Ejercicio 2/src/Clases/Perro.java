package Clases;

public class Perro extends Animal{
    private String raza;

    public Perro(){

    }
    public Perro(String nombre, String genero, int edad, String raza) {
        super(nombre, genero, edad);
        this.raza = raza;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacer_sonido(){
        System.out.println("El perro ladra");
    }

    @Override
    public void informacion(){
        System.out.println("Nombre: " + this.nombre + "\nGenero: " + this.genero + "\nEdad: " + this.edad + "\nRaza: " + this.raza);
    }



}
