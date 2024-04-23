import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1 = 0.0;
        double number2 = 0.0;
        int condition = 0;

        while (condition == 0) {
            try {
                System.out.println("Ingrese el primer numero: ");
                number1 = sc.nextDouble();

                System.out.println("Ingrese el segundo numero:");
                number2 = sc.nextDouble();

                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero. Inténtalo de nuevo.");

                sc.nextLine();
            }
        }

        sc.nextLine();

        while (true){
            int option = 0;

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            System.out.print("Ingrese su opcion: ");
            String optionStr = sc.nextLine();

            try {
                option = Integer.parseInt(optionStr);
            } catch (NumberFormatException e){
                System.out.println("Ingrese una opcion de las anteriores");
            }

            switch (option){
                case 1 -> {
                    double agregation = number1 + number2;
                    System.out.println("La suma entre " + number1 + " y " + number2 + " es: " + agregation);
                }
                case 2 -> {
                    double subtraction = number1 - number2;
                    System.out.println("La resta entre " + number1 + " y " + number2 + " es: " + subtraction);
                }
                case 3 -> {
                    double multiplication = number1 * number2;
                    System.out.println("El producto entre " + number1 + " y " + number2 + " es: " + multiplication);
                }
                case 4 -> {
                    try {
                        if (number2 == 0.0){
                            throw new ArithmeticException();
                        }
                        double division = number1 / number2;
                        double rest = number1 % number2;
                        System.out.println("El cociente entre " + number1 + " y " + number2 + " es: " + division + " y el resto es " + rest);
                    }catch (ArithmeticException e){
                        System.out.println("No se puede dividir por 0. Ingrese un numero distinto");
                    }
                }
                case 5 ->{
                    condition = 1;
                    System.out.println("Saliendo...");
                }
            }
            if (condition == 1){
                break;
            }
        }
    }
}
