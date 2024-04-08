package Exercise9;

public class Circle extends geometricFigure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.1416*(Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return 2*3.1416*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
