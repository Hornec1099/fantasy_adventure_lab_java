package Character;


import Character.Behaviours.ICastSpell;
import Creature.Creature;
import Weapons.Spells;

public abstract class Mage extends Character implements ICastSpell {

    Spells spell;

    public Mage(String name, int armour, int health, int wallet, Spells spell) {
        super(name, armour, health, wallet);
        this.spell = spell;
    }

    public String castSpell(Spells spell, Creature enemy){
        return "spell casted";
    }
}
