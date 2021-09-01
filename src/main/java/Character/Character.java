package Character;

public abstract class Character {

    private String name;
    private int armour;
    private int health;

    public Character(String name, int armour,int health){
        this.name = name;
        this.armour = armour;
        this.health = health;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
