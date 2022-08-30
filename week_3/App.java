public class App {
    public static void main(String[] args) {

    	//Gears List
    	Gear artifact = new Gear();
    	artifact.name = "Trinity Orb of Disaster";
    	artifact.damage = 350;
    	artifact.health = 15;
    	artifact.rarity = "SSR";
    	artifact.isElemental = true;
    	artifact.description = "Created by the goddesses, it is used to manipulate disasters.";
    	
    	Gear necklace = new Gear();
    	necklace.name = "Codename:Ark!";
    	necklace.damage = 5;
    	necklace.health = 400;
    	necklace.rarity = "SR";
    	necklace.isElemental = false;
    	necklace.description = "Created by humans, it is an artifact used against the goddesses.";
    	
    	//Weapons List
    	
    	Weapon longSword = new Weapon();
    	longSword.name = "Favonious GreatSword";
    	longSword.damage = 63;
    	longSword.armor = 0;
    	longSword.rarity = "R";
    	longSword.isElemental = false;
    	longSword.description = "A great sword";
    	
    	Weapon scythe = new Weapon();
    	scythe.name = "Scythe of Mara";
    	scythe.damage = 321;
    	scythe.armor = 20;
    	scythe.rarity = "SSR";
    	scythe.isElemental = true;
    	scythe.description = "An artifact created by the blood of demons";
    	
    	//Characters List
    	
        Character knight = new Character();
        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.HP = 80;
        knight.name = "Chen";
        
        knight.sayMyAttributes();
        knight.SPCITM = "'The Shield of NoUs'";
        knight.sayMySpecialITM();
        longSword.sayWeapon();

        Character mage = new Character();
        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.HP = 50;
        mage.name = "Akasha";
        
        mage.sayMyAttributes();
        artifact.sayGear();

        Character rogue = new Character();
        rogue.strength = 5;
        rogue.agility = 10;
        rogue.intelligence = 0;
        rogue.HP = 60;
        rogue.name = "Gondar";
        
        rogue.sayMyAttributes();
        scythe.sayWeapon();

        Character healer = new Character();
        healer.strength = 0;
        healer.agility = 5;
        healer.intelligence = 10;
        healer.name = "Mikudayo";
        healer.HP = 100;
        
        healer.sayMyAttributes();
        healer.SPCITM = "'The Ring of UwUs'";
        healer.sayMySpecialITM();
        necklace.sayGear();
        
        System.out.println("\n===================================\n\n*You have encountered an enemy!..");
        
        //Enemies List
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();
        
    }
}
