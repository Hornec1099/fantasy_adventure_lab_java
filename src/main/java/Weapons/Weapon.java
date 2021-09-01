package Weapons;

public class Weapon {

    private String name;
    private WeaponType weaponType;
    private int damage;

    public Weapon(String name, WeaponType weaponType, int damage){
        this.name = name;
        this.weaponType = weaponType;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
