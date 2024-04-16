package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero de la posicion " + (i+1) + ": ");
            numbers.add(sc.nextInt());
        }

        int biggerNum = numbers.get(0);
        int position = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (biggerNum < numbers.get(i)){
                biggerNum = numbers.get(i);
                position = i;
            }
        }

        System.out.println("El mayor número es " + biggerNum + " y está en la posición " + (position + 1) + " de la lista.");
    }
}
