package Character;


import Character.Behaviours.ICastSpell;
import Creature.Creature;

public abstract class Mage extends Character implements ICastSpell {

    Creature creature;

    public Mage(String name, int armour, int health, Creature creature) {
        super(name, armour, health);
        this.creature = creature;
    }

    public String castSpell(){
        return "spell casted";
    }
}
