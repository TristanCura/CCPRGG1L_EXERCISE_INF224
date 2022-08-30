public class Gear {
	
	String name;
	int damage;
	int health;
	String rarity;
	String description;
	Boolean isElemental;
	
	public void sayGear() {
		System.out.println("\t*Equipped the gear '" + name + "' [" + rarity + "]\n\t\t*ATK+" + damage + "\n\t\t*HP+" + health);
	}
}
