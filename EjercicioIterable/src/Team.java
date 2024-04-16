import java.util.ArrayList;
import java.util.Iterator;

public class Team implements Iterable<Player>{
    private String clubName;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String clubName) {
        this.clubName = clubName;
    }

    public void addPlayer(Player p){
        players.add(p);
    }



    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }

}
