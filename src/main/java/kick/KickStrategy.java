package kick;

import lotr.Character;

public interface KickStrategy {
    void kick(Character whoKicks, Character opponent);
}
