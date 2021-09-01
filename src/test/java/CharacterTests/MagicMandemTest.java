package CharacterTests;
import Character.Warlock;
import Creature.Creature;
import Weapons.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicMandemTest {

    Warlock testWarlock;
    Creature testCreature;
    Creature enemyCreature;
    Creature strongCreature;

    @Before
    public void before() {
        enemyCreature = new Creature("Ogreman", 15, 10);
        strongCreature = new Creature("ultimate ogre", 50, 25);

        testCreature = new Creature("Dragon", 25, 20);
        testWarlock = new Warlock("Shylock", 5, 35, 50, Spells.FIRE, testCreature);

    }

    @Test
    public void testDoingComboDamage(){
        assertEquals("The creature is dead", testWarlock.attackEnemy(enemyCreature));
    }

    @Test
    public void testDamageIsNotOneShot(){
        assertEquals("The creature has 20 health", testWarlock.attackEnemy(strongCreature));
    }



}
