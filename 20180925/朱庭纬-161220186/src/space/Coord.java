package space;

import creature.Creature;

public class Coord {

	private boolean existCreature;
	private Creature creatureInCoord;
	
	public boolean setCreature(Creature creature) {
		if (existCreature) {
			return false;
		} else {
			existCreature = true;
			creatureInCoord = creature;
			return true;
		}		
	}
	
	public void clearCreature() {
		existCreature = false;
	}
	
	public boolean existCreature() { return existCreature; }
	
	@Override
	public String toString() {
		return creatureInCoord.toString();
	}

}
