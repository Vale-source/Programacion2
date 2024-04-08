package Exercise9;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(3,4);

        System.out.println("Radio del circulo: " + c1.getRadius());
        System.out.println("Area del circulo: " + c1.calculateArea());
        System.out.println("Radio del circulo: " + c1.calculatePerimeter() + "\n");
        System.out.println("Altura del rectangulo: " + r1.getHeigth());
        System.out.println("Base del rectangulo: " + r1.getBase());
        System.out.println("Area del rectangulo: " + r1.calculateArea());
        System.out.println("Perimetro del rectangulo: " + r1.calculatePerimeter());
    }
}
