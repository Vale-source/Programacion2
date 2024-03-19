package Clases;

public class Oficial extends Operario{

    private int revision;

    public Oficial(){

    }

    public Oficial(String name, int hours_worked, int pay, int revision) {
        super(name, hours_worked, pay);
        this.revision = revision;
    }

    @Override
    public String toString() {
        return super.toString() + ", Revisiones al día: " + revision;
    }

    public boolean good_worker(){
        if (revision >= 4 ) {
            return true;
        } else {
            return false;
        }
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }
}
