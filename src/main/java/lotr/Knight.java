package lotr;

import kick.RandomKick;

import java.util.Random;

public class Knight extends Character{

    public Knight() {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2, new RandomKick());
    }
}
