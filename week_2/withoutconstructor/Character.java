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
        System.out.println("\t>My Strength is " + strength);
    }

    public void sayMyAgiliy() {
        System.out.println("\t>My Agility is " + agility);
    }
    public void sayMyIntelligence() {
        System.out.println("\t>My Intelligence is " + intelligence);
    }

    public void sayMyHP() {
        System.out.println("\t>My Base HP is " + HP);
    }

    public void sayMySpecialITM() {
        System.out.println("\t>My Special Item is " + SPCITM);
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
