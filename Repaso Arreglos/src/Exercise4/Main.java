package Exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero de la posicion " + (i+1) + ": ");
            numbers.add(sc.nextInt());
        }

        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) % 10 == 4){
                System.out.println("El numero " + numbers.get(i) + " termina en 4 y su posicion es " + (i+1));
            }
        }
    }
}
