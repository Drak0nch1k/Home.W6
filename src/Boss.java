import java.util.stream.StreamSupport;

public class Boss extends GameEntity{

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Boss name: " + getName() + ", Boss damage: " + getDamage() +
                ", Boss health: " + getHealth() + ", Boss weapon: " + getWeapon().getWeaponType();
    }
}
