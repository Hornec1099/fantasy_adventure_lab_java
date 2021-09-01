package Character.Behaviours;

import Creature.Creature;
import Weapons.Spells;

public interface ICastSpell {

    String castSpell(Spells spell, Creature creature);
}
