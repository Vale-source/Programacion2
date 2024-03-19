package Clases;

import java.util.Objects;

public class Tecnico extends Operario{
    private String work_area;

    public Tecnico(){

    }

    public Tecnico(String name, int hours_worked, int pay, String work_area) {
        super(name, hours_worked, pay);
        this.work_area = work_area;
    }

    @Override
    public String toString() {
        return super.toString() + ", Área laboral: " + work_area;
    }

    public String social_work(){
        if ((Objects.equals(work_area, "mantenimiento")) || (Objects.equals(work_area,"electrico"))){
            return "Este operario tiene obra social";
        } else {
            return "Este operario no tiene obra social";
        }
    }

    public String getWork_area() {
        return work_area;
    }

    public void setWork_area(String work_area) {
        this.work_area = work_area;
    }
}
