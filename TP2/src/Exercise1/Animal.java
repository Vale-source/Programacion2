package Exercise1;

public abstract class Animal {
    protected int age;
    protected String name;
    protected int price;
    protected String typeAnimal;

    public Animal(int age, String name, int price, String typeAnimal) {
        this.age = age;
        this.name = name;
        this.price = price;
        this.typeAnimal = typeAnimal;
    }

    public void feed(String name){

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", typeAnimal='" + typeAnimal + '\'' +
                '}';
    }
}
