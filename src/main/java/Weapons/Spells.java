package Weapons;

public enum Spells {

    FIRE(10),
    WATER(5),
    EARTH(3),
    AIR(7);

    private int damage;
    Spells(int damage){
        this.damage= damage;
    }
        }
