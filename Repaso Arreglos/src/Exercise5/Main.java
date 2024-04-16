package Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero de la posicion " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        int biggerNum = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (biggerNum < numbers.get(i)) {
                biggerNum = numbers.get(i);
            }
        }

        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == biggerNum){
                counter++;
            }
        }

        System.out.println("El numero mas grande es " + biggerNum + " y se repite: " + counter + " veces");
    }
}
