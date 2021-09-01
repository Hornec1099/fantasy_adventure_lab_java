package Character;

import Character.Behaviours.ICollect;
import Character.Behaviours.IWalk;
import Environment.Collectables.Treasure;

public abstract class Character implements IWalk, ICollect {

    private String name;
    private int armour;
    private int health;
    private int wallet;

    public Character(String name, int armour,int health, int wallet){
        this.name = name;
        this.armour = armour;
        this.health = health;
        this.wallet = wallet;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String walk() {
        return "walks forward";
    }

    public void collectItem(Treasure item){
        this.wallet += item.getValue();
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        if (this.armour > damage) {
            armour -= damage;
        } else {
            int newDamage = damage - armour;
            this.health -= newDamage;
            this.armour = 0;
        }
    }

    public int getWallet() {
        return wallet;
    }


}
