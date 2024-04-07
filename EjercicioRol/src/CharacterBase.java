public abstract class CharacterBase implements Character {
    protected int level;
    protected String name;
    protected int lifePoints;

    public CharacterBase(int level, String name, int lifePoints) {
        this.level = level;
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
