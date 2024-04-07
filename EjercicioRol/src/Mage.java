public class Mage extends CharacterBase {

    public Mage(int level, String name, int lifePoints) {
        super(level, name, lifePoints);
    }

    @Override
    public int attack() {
        return 10*this.level;
    }

    @Override
    public int defend(int damage) {
        return damage*this.level;
    }
}
