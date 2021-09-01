package Creature;
import Character.Character;

public class Creature {

    String name;
    int health;
    int damage;

    public Creature(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){
        return this.health;
    }

    public String takeDamage(int damageTaken){
        this.health -= damageTaken;
        if (this.health <= 0){
            return "The creature is dead";
        } else {
            return "The creature has " + this.health + " health";
        }
    }

    public void attackCharacter(Character character){
        character.takeDamage(this.damage);
    }

    public int getDamage(){
        return this.damage;
    }
}
