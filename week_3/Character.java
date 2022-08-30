public class Character{
    int strength;
    int agility;
    int intelligence;
    int HP;
    String SPCITM;
    String name;
    
    public void sayMyName(){
        System.out.println("\n*Hello I am " + "'" + name + "'...");
    }

    public void sayMyStrength() {
        System.out.println("\t>Strength: " + strength);
    }

    public void sayMyAgiliy() {
        System.out.println("\t>Agility: " + agility);
    }
    public void sayMyIntelligence() {
        System.out.println("\t>Intelligence: " + intelligence);
    }

    public void sayMyHP() {
        System.out.println("\t>Base HP: " + HP);
    }

    public void sayMySpecialITM() {
        System.out.println("\t>Special Item: " + SPCITM);
    }
    
//--------------------------------------------------------------

    public void sayMyAttributes(){
        sayMyName();
        sayMyStrength();
        sayMyAgiliy();
        sayMyIntelligence();
        sayMyHP();
    }
}