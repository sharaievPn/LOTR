package kick;

import lotr.Character;

public class Cry implements KickStrategy{

    @Override
    public void kick(Character whoKicks, Character opponent) {
        System.out.println("I can not fight. I am just crying :(");
    }
}
