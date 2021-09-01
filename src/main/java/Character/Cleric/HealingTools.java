package Character.Cleric;

public enum HealingTools {

    REDPOTION(20),
    HEALINGHERBS(10),
    BERRIES(5);

    private int healing;
    HealingTools(int healing){
        this.healing = healing;
    }

    public int getHealingAmount(){
        return healing;
    }
}
