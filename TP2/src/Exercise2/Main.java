package Exercise2;

public class Main {
    public static void main(String[] args) {

        Novel novela1 = new Novel("1984", "George Orwell", 1949, false, "Distopía");
        Novel novela2 = new Novel("Matar a un ruiseñor", "Harper Lee", 1960, false, "Devenir adulto");

        Academic academico1 = new Academic("Introducción a los Algoritmos", "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein", 2009, false, "Ciencias de la Computación");
        Academic academico2 = new Academic("Principios de Economía", "N. Gregory Mankiw", 2018, false, "Economía");

        Childish infantil1 = new Childish("Donde viven los monstruos", "Maurice Sendak", 1963, false, "3-7");
        Childish infantil2 = new Childish("La oruga muy hambrienta", "Eric Carle", 1969, false, "2-5");

        Librery librery1 = new Librery();

        librery1.addBook(novela1);
        librery1.addBook(novela2);
        librery1.addBook(academico1);
        librery1.addBook(academico2);
        librery1.addBook(infantil1);
        librery1.addBook(infantil2);

        System.out.println("Lista de libros inicial: ");
        librery1.seeBooks();
        System.out.println();

        System.out.println("Prueba de los metodos lend():");
        librery1.lendBook("Farenheit 451","Ray Bradbury"); //Prueba de un libro que no este en la lista
        librery1.lendBook("Rebelion en la granja","George Orwell"); //Prueba de un libro que no esta en la lista con algun autor de la lista
        librery1.lendBook("1984","Ray Bradbury"); //Prueba de un libro que esta en la lista con otro autor
        System.out.println();
        librery1.lendBook("1984","George Orwell");
        librery1.lendBook("1984","George Orwell"); //Pedir dos veces el mismo libro
        System.out.println();
        librery1.lendBook("Donde viven los monstruos", "Maurice Sendak");
        System.out.println();

        System.out.println("Lista sin los libros prestados:");
        librery1.seeBooks();
        System.out.println();

        System.out.println("Prueba del metodo giveBackBook: ");
        librery1.giveBackBook("1984","George Orwell");
        System.out.println();


        System.out.println("Comprobar si la lista imprime el libro devuelto:");
        librery1.seeBooks();



    }
}
