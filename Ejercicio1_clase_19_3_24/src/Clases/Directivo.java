package Clases;

public class Directivo extends Empleado {
    private int enrollment;

    public Directivo(){

    }
    public Directivo(String name, int enrollment) {
        super(name);
        this.enrollment = enrollment;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + enrollment;
    }

    public String antiquity(){
        String numberStr = String.valueOf(this.enrollment);
        int addition = 0;

        for (int i = 0; i < numberStr.length() ; i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            addition += digit;
        }

        if (addition > 20){
            return "Este directivo es de primera generacion";
        } else {
            return "Este directivo es de segunda generacion";
        }
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }
}
