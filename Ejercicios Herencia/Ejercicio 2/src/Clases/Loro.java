package Clases;

public class Loro extends Animal {

    private String plumaje;

    public Loro(){

    }

    public Loro(String nombre, String genero, int edad, String plumaje) {
        super(nombre, genero, edad);
        this.plumaje = plumaje;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    @Override
    public void hacer_sonido(){
        System.out.println("El loro imita a los humanos");
    }

    @Override
    public void informacion(){
        System.out.println("Nombre: " + this.nombre + "\nGenero: " + this.genero + "\nEdad: " + this.edad + "\nPlumaje: " + this.plumaje);
    }
}
