package Exercise3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> week = new ArrayList<>();
        week.add("Lunes");
        week.add("Martes");
        week.add("Miercoles");
        week.add("Jueves");
        week.add("Viernes");
        week.add("Sabado");
        week.add("Domingo");

        week.add(4,"Juernes");
        System.out.println("Se agrego Juernes a la lista");

        System.out.println();

        System.out.println("Elemento en la posicion 3: " + week.get(3));
        System.out.println("Elemento en la posicion 4: "+week.get(4));

        System.out.println();

        week.remove("Juernes");
        System.out.println("Se removio Juernes");

        System.out.println();
        for (String a : week){
            System.out.println(a);
        }

        System.out.println("La lista de dias contiene el lunes: " + week.contains("Lunes"));

        week.clear();
        System.out.println("La lista de dias esta vacia: " + week.isEmpty());
    }
}
