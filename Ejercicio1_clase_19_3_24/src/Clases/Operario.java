package Clases;

public class Operario extends Empleado {

    private int hours_worked;
    private int pay;

    public Operario(){

    }

    public Operario(String name, int hours_worked, int pay) {
        super(name);
        this.hours_worked = hours_worked;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Horas trabajadas " + hours_worked;
    }

    public int balance(){
        return this.hours_worked * this.pay;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }
}
