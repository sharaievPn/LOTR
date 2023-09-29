package lotr;

public class GameManager {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        GameManager game = new GameManager();
        game.fight(c1, c2);
    }

    public void fight (Character c1, Character c2) {
        int counter = 1;
        String fstCharacter = c1.getClass().getSimpleName();
        String sndCharacter = c2.getClass().getSimpleName();
        System.out.println("Health of " + fstCharacter + " is " + c1.getHp());
        System.out.println("Health of " + sndCharacter + " is " + c2.getHp());
        System.out.println();
        System.out.println("Power of " + fstCharacter + " is " + c1.getPower());
        System.out.println("Power of " + sndCharacter + " is " + c2.getPower());
        System.out.println();
        while (c1.isAlive() && c2.isAlive()) {
            if (counter % 2 == 1) {
                System.out.println(fstCharacter + " fights " + sndCharacter);
                c1.kick(c2);
                System.out.println("Health of " + sndCharacter + " is " + c2.getHp());
            } else {
                System.out.println(sndCharacter + " fights " + fstCharacter);
                c2.kick(c1);
                System.out.println("Health of " + fstCharacter + " is " + c1.getHp());
            }
            counter++;
            System.out.println();
        }
        if (!c1.isAlive()) {
            System.out.println(sndCharacter + " wins!");
            System.out.println(fstCharacter + " is defeated!");
        } else if (!c2.isAlive()) {
            System.out.println(fstCharacter + " wins!");
            System.out.println(sndCharacter + " is defeated!");
        }
    }
}
