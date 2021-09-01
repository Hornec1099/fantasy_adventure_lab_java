package Character.Cleric;

import java.util.ArrayList;

import Character.Behaviours.IHeal;
import Character.Character;
import Environment.Collectables.Treasure;

public class Cleric extends Character implements IHeal {

    HealingTools healingTool;
    ArrayList<HealingTools> bag;

    public Cleric(String name, int armour, int health, int wallet){
        super(name, armour, health, wallet);
        this.bag = new ArrayList<>();
    }

    public void setHealingTool(HealingTools toolToFind){
        if (this.healingTool != null){
            this.bag.add(this.healingTool);
        }
        int index = this.bag.indexOf(toolToFind);
        this.healingTool = this.bag.remove(index);
    }

    public void healTarget(Character target){
        int currentHealth = target.getHealth();
        int newHealth = currentHealth += this.healingTool.getHealingAmount();
        target.setHealth(newHealth);
    }

}
