package CharacterTests;
import Character.Knight;
import Creature.Creature;
import Environment.Collectables.Treasure;
import Weapons.Weapon;
import Weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {
     Knight testKnight;
     Weapon testWeapon;
     Creature testCreature;
     Treasure testTreasure;

     @Before
     public void before(){
          testWeapon = new Weapon("Big Axe", WeaponType.AXE, 4);
          testKnight = new Knight("David", 15, 50, 100, testWeapon);
          testCreature = new Creature("werewolf", 20, 10);
          testTreasure = new Treasure(20);
     }

     @Test
     public void characterCanHaveWeapon(){
          assertEquals(testWeapon, testKnight.getWeapon());
     }

     @Test
     public void canWalk(){
          assertEquals("walks forward", testKnight.walk());
     }

     @Test
     public void canFight(){
          testKnight.attackEnemy(testCreature);
          assertEquals(16, testCreature.getHealth());
     }

     @Test
     public void armourCanTakeDmg(){
          testCreature.attackCharacter(testKnight);
          assertEquals(5,testKnight.getArmour());
          assertEquals(50, testKnight.getHealth());
     }

     @Test
     public void damageTakenAfterArmour(){
          testCreature.attackCharacter(testKnight);
          testCreature.attackCharacter(testKnight);
          assertEquals(45, testKnight.getHealth());
          assertEquals(0, testKnight.getArmour());
     }

     @Test
     public void canCollectTreasure(){
          testKnight.collectItem(testTreasure);
          assertEquals(120, testKnight.getWallet());
     }
}
