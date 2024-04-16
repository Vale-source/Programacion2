//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Team Boca = new Team("Boca");
            Player p1 = new Player("Juan",1,15);
            Player p2 = new Player("Pedro",2,23);
            Player p3 = new Player("Fausto",3,19);

            Boca.addPlayer(p1);
            Boca.addPlayer(p2);
            Boca.addPlayer(p3);

            for (Player p : Boca){
                p.showDetails();
            }
        }
    }
