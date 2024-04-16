
public class Player {
    private String name;
    private int position;
    private int jerseyNumber;

    public Player(String name, int position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void showDetails(){
        System.out.println("Jugador: " + this.name + "\nPosicion: " + this.position + "\nNumero de camiseta: " + this.jerseyNumber);
    }
}
