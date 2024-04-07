public class Main {
    public static void main(String[] args) {
        Warrior Alfred = new Warrior(10,"Alfred",1000);
        Mage Juan = new Mage(10,"Juan",800);
        Rogue Pedro = new Rogue(10,"Pedro",800);

        System.out.println(Alfred.getName() + " ataco a " + Juan.getName());
        System.out.println(Juan.getName() + " sufrio " + Juan.defend(Alfred.attack()) + " de daño");
        System.out.println("Vida actual de " + Juan.getName() + ": " + (Juan.getLifePoints() - Juan.defend(Alfred.attack())) + "\n");
        Juan.setLifePoints(Juan.getLifePoints() - Juan.defend(Alfred.attack()));

        System.out.println(Juan.getName() + " ataco a " + Pedro.getName());
        System.out.println(Pedro.getName() + " sufrio " + Pedro.defend(Juan.attack()) + " de daño");
        System.out.println("Vida actual de " + Pedro.getName() + ": " + (Pedro.getLifePoints() - Pedro.defend(Juan.attack())) + "\n");
        Pedro.setLifePoints(Pedro.getLifePoints() - Pedro.defend(Juan.attack()));

        System.out.println(Pedro.getName() + " ataco a " + Alfred.getName());
        System.out.println(Alfred.getName() + " sufrio " + Alfred.defend(Pedro.attack()));
        System.out.println("Vida actual de " + Alfred.getName() + ": " + (Alfred.getLifePoints() - Alfred.defend(Pedro.attack())) + "\n");
        Alfred.setLifePoints(Alfred.getLifePoints() - Alfred.defend(Pedro.attack()));

    }
}
