package Exercise3;

import java.util.Scanner;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero de la posicion " + (i+1) + ": ");
            numbers.add(sc.nextInt());
        }

        int cousinNum = 2;
        int position = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int counter = 0;
            for (int j = 1; j <= numbers.get(i); j++){
                if (numbers.get(i) % j == 0){
                    counter++;
                    if (counter == 2 && (cousinNum < numbers.get(i))){
                        cousinNum = numbers.get(i);
                        position = i;
                    }
                }
            }
        }
        System.out.println("El numero primo mas grande en la lista es: " + cousinNum + " y su posicion es: " + (position+1));
    }
}
