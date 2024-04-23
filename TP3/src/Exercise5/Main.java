package Exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TaskList tasks = new TaskList();

        int output = 0;
        while (output == 0){
            System.out.println();
            System.out.println("1. Agregar tarea a la lista");
            System.out.println("2. Ver lista en orden descendente");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir del programa");

            System.out.print("Ingrese su opcion: ");
            String optionStr = sc.nextLine();

            try {
                int option = Integer.parseInt(optionStr);

                switch (option){
                    case 1:
                        System.out.println("Ingrese la descripcion de la tarea: ");
                        String description = sc.nextLine().toLowerCase();

                        if (description.matches("^(?=.*[a-zA-Z])[a-zA-Z0-9 ]+$")){
                            System.out.println("Ingrese la prioridad de la tarea: ");
                            String priority = sc.nextLine();

                            if (priority.matches("[1-9][0-9]?|100")){
                                int priorityInt = Integer.parseInt(priority);

                                Task newTask = new Task(description, priorityInt);

                                tasks.addTask(newTask);
                            } else {
                                System.out.println("Ingrese una prioridad valida");
                            }
                        } else {
                            System.out.println("Ingrese una descripcion valida");
                        }

                        break;

                    case 2:
                        tasks.orderedList();
                        break;

                    case 3:
                        System.out.println("Ingrese la descripcion de la tarea que desea eliminar");
                        String deleteDescription = sc.nextLine().toLowerCase();

                        tasks.deleteTask(deleteDescription);

                        break;

                    case 4:
                        output = 1;
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero valido como opcion");
            }
        }
    }
}

