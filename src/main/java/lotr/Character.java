package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public void kick(Character opponent) {
        kickStrategy.kick(this, opponent);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() +", power=" + getPower() +"}";
    }
}
