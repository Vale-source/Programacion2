
public class Athlete extends Person implements Contract{

    private double height;
    private double weight;
    private int age;

    public Athlete(int dni, String name, double height, double weight, int age) {
        super(dni, name);
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double calculateIMC() {
        return this.weight/Math.pow(this.height,2);
    }

    @Override
    public boolean existExtraWeight() {
        double IMC = calculateIMC();
        if (IMC > 24.9 && IMC < 30){
            return true;
        }
        return false;
    }

    @Override
    public double takePulses() {
        return 80;
    }
}
