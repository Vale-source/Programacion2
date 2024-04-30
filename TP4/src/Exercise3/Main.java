package Exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Ingrese la base del triangulo: ");
            double base = sc.nextDouble();
            System.out.print("Ingrese la altura del triangulo: ");
            double height = sc.nextDouble();

            System.out.println("El area del triangulo es: " + calculateArea(base,height));

        }catch (InputMismatchException e){
            System.out.println("Ingreso de datos no validos");
        }


    }

    public static double calculateArea(double b, double h){
        double area = (b*h)/2;
        return area;
    }
}
