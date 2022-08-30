public class Weapon {
	
	String name;
	int damage;
	int armor;
	String rarity;
	String description;
	Boolean isElemental;
	
	public void sayWeapon() {
		System.out.println("\t*Equipped the weapon '" + name + "' [" + rarity + "]\n\t\t*ATK+" + damage + "\n\t\t*DEF+" + armor);
	}
}
