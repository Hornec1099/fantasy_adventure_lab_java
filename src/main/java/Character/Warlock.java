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

    public String attackEnemy(Creature enemyCreature){
        //get our creature dmg
        //add to warlock damage
        //take both from enemyCreature
        int creatureDamage = this.creature.getDamage();
        int comboDamage = this.castSpell() + creatureDamage;
        return enemyCreature.takeDamage(comboDamage);
    }
}
