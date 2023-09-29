package kick;

import lotr.Character;

public class ElfKicks implements KickStrategy{

    @Override
    public void kick(Character whoKicks, Character opponent) {
        int elfPower = whoKicks.getPower();
        int opponentPower = opponent.getPower();
        if (elfPower > opponentPower) {
            opponent.setHp(0);
        } else {
            whoKicks.setPower(elfPower - 1);
        }
    }
}
