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

    public void takeDamage(int damageTaken){
        this.health -= damageTaken;
    }

    public void attackCharacter(Character character){
        character.takeDamage(this.damage);
    }
}
