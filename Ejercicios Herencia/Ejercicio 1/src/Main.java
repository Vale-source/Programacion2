import Clases.*;

public class Main {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta("Amarillo", 2, "deportiva");
        Motocicleta motorbike = new Motocicleta("Rojo", 2, "urbana", 300F, 250F);
        Coche car = new Coche("Azul", 4, 300F, 1.8F);
        Camioneta van = new Camioneta("Verde", 4, 350F, 4.0F, 210F);

        Vehiculo[] vehicles = {bike, motorbike, car, van};

        catalogar(vehicles, 4);
        catalogar(vehicles, 2);
        catalogar(vehicles, 0);

    }

    public static void catalogar(Vehiculo[] vehicles, int wheels) {

        int counter = 0;
        for (Vehiculo vehicle : vehicles) {
            if (vehicle.getWheels() == wheels){
                counter++;
            }
        }

        System.out.println("\nSe han encontrado "+counter+" vehiculos con "+wheels+" ruedas");

        for (int i = 0; i < vehicles.length; i++) {

            if (vehicles[i].getWheels() == wheels) {

                System.out.println("\nVehiculo: " + vehicles[i].getClass().getName() + "\nColor: " + vehicles[i].getColor() + "\nRuedas: " + vehicles[i].getWheels());
                if (vehicles[i] instanceof Bicicleta bike) {

                    System.out.println("Tipo: " + bike.getType());

                } else if (vehicles[i] instanceof Motocicleta motorbike) {

                    System.out.println("Tipo: " + motorbike.getType());
                    System.out.println("\nVelocidad: " + motorbike.getVelocity());
                    System.out.println("\nCilindrada: " + motorbike.getDisplacement());

                } else if (vehicles[i] instanceof Coche car) {

                    System.out.println("Velocidad: " + car.getCar_velocity());
                    System.out.println("Cilindrada: " + car.getCar_displacement());

                } else if (vehicles[i] instanceof Camioneta van) {
                    System.out.println("Velocidad: " + van.getCar_velocity());
                    System.out.println("Cilindrada: " + van.getCar_displacement());
                    System.out.println("Carga: " + van.getLoad());
                }
            }
        }
    }
}