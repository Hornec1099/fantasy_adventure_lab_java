package Creature;

public class Creature {

    String name;
    int health;
    int damage;

    public Creature(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int damageTaken){
        this.health -= damageTaken;
    }
}
