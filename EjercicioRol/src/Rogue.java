public class Rogue extends CharacterBase {


    public Rogue(int level, String name, int lifePoints) {
        super(level, name, lifePoints);
    }

    @Override
    public int attack() {
        return 70+this.level;
    }

    @Override
    public int defend(int damage) {
        return damage;
    }
}
