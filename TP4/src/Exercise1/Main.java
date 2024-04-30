package Exercise1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = rand.nextInt(98) + 2;
        int tries = 0;
        boolean condition = true;

        while (condition){
//            System.out.println(tries);
//            System.out.println(randomNumber);
//            para comprbar que funciona
            System.out.println("Intente adivinar un numero entre 1 y 100 ");
            System.out.print("Ingrese un numero: ");
            String putNumberStr = sc.nextLine();
            try {
                int putNumber = Integer.parseInt(putNumberStr);

                if (putNumber > randomNumber){
                    System.out.println("El numero que tienes que adivinar es menor");
                    tries++;
                } else if (putNumber < randomNumber) {
                    System.out.println("El numero que tienes que adivinar es mayor");
                    tries++;
                } else {
                    System.out.println("Has adivinado!! El numero correcto es " + randomNumber);
                    condition = false;
                }

            } catch (NumberFormatException e){
                System.out.println("Ingrese un caracter numerico valido");
                tries++;
            }
        }

        System.out.println("Te ha tomado " + tries + " intentos adivinar");
    }
}
