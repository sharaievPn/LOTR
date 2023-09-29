package kick;

import lotr.Character;
import java.util.Random;

public class RandomKick implements KickStrategy{

    @Override
    public void kick(Character whoKicks, Character opponent) {
        int characterPower = whoKicks.getPower();
        opponent.setHp(opponent.getHp() - new Random().nextInt(characterPower) + 1);
    }
}
