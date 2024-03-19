package Clases;

public class Gato extends Animal{

    private String especie;

    public Gato(){

    }

    public Gato(String nombre, String genero, int edad, String especie) {
        super(nombre, genero, edad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void hacer_sonido(){
        System.out.println("El gato maulla");
    }

    @Override
    public void informacion(){
        System.out.println("Nombre: " + this.nombre + "\nGenero: " + this.genero + "\nEdad: " + this.edad + "\nEspecie: " + this.especie);
    }
}
