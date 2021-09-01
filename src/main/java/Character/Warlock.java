package Character;

import Creature.Creature;
import Weapons.Spells;

public class Warlock extends Mage{

    Creature creature; //only a warlock gets a creature

    public Warlock(String name, int armour, int health, int wallet, Spells spell, Creature creature){
        super(name, armour, health, wallet, spell);
        this.creature = creature;
    }

    public Creature getCreature(){
        return this.creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
