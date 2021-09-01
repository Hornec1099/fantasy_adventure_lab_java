package Character;

import Character.Behaviours.IFight;
import Creature.Creature;
import Weapons.Weapon;

public abstract class Fighter extends Character implements IFight {

    private Weapon weapon;

    public Fighter(String name, int armour, int health, int wallet, Weapon weapon){
        super(name, armour, health, wallet);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attackEnemy(Creature creature) {
        int damage = weapon.getDamage();
        creature.takeDamage(damage);
    }


}
