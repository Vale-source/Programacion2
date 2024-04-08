package Exercise10;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Habtios Atomicos", "James Clear", 14600F);
        TextBook t1 = new TextBook("Calculo: Trascendentes Tempranas", "James Stewart",13000F,"Curso A3");
        TextBookUNC t1UNC = new TextBookUNC("Física Universitaria: Avanazada", "Fernando Carlos Arenas",16000,"Curso C3", "Facultad de Ingenieria");
        Novel n1 = new Novel("Farenheit 451","Ray Bradbury",23000,"Ciencia Ficcion");

        System.out.println(b1.print() + "\n");
        System.out.println(t1.print() + "\n");
        System.out.println(t1UNC.print() + "\n");
        System.out.println(n1.print());
    }
}
