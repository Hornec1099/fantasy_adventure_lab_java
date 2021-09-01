package Character;


import Character.Behaviours.ICastSpell;
import Creature.Creature;
import Weapons.Spells;

public abstract class Mage extends Character implements ICastSpell {

    Creature creature;
    Spells spell;

    public Mage(String name, int armour, int health, Creature creature, Spells spell) {
        super(name, armour, health);
        this.creature = creature;
        this.spell = spell;
    }

    public String castSpell(Spells spell, Creature enemy){
        return "spell casted";
    }
}
