public class Warrior extends CharacterBase {

    public Warrior(int level, String name, int lifePoints) {
        super(level, name, lifePoints);
    }

    @Override
    public int attack() {
        return 20;
    }

    @Override
    public int defend(int damage) {
        return damage-30;
    }
}
