package CharacterTests;
import Character.Warlock;
import Creature.Creature;
import Weapons.Spells;
import org.junit.Before;
import org.junit.Test;

public class MagicMandemTest {

    Warlock testWarlock;
    Creature testCreature;
    Creature enemyCreature;

    @Before
    public void before() {
        enemyCreature = new Creature("Ogreman", 15, 10);
        testCreature = new Creature("Dragon", 25, 20);
        testWarlock = new Warlock("Shylock", 5, 35, 50, Spells.FIRE, testCreature);
    }

    @Test
    public void testDoingComboDamage(){
        testWarlock.attackEnemy(enemyCreature);

    }

}
