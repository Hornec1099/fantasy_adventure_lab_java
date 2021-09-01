package Character;

public class Character {

    private String name;
    private int armour;

    public Character(String name, int armour){
        this.name = name;
        this.armour = armour;
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
