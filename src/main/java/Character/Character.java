package Character;

import Character.Behaviours.ICollect;
import Character.Behaviours.IWalk;

public abstract class Character implements IWalk, ICollect {

    private String name;
    private int armour;
    private int health;

    public Character(String name, int armour,int health){
        this.name = name;
        this.armour = armour;
        this.health = health;
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

    public String collectItem(){
        return "item collected";
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
