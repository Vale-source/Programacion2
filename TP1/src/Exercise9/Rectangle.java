package Exercise9;

public class Rectangle extends geometricFigure{
    private double heigth;
    private double base;

    public Rectangle(double heigth, double base) {
        this.heigth = heigth;
        this.base = base;
    }


    @Override
    public double calculateArea() {
        return heigth * base;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (heigth + base);
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
