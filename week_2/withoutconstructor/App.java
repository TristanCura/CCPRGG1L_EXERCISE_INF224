public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.HP = 80;
        knight.name = "Chen";
        knight.sayMyAttributes();
        knight.SPCITM = "'The Shield of NoUs'";
        knight.sayMySpecialITM();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.HP = 50;
        mage.name = "Akasha";
        mage.sayMyAttributes();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.HP = 60;
        thief.name = "Gondar";
        thief.sayMyAttributes();

        Character healer = new Character();

        healer.strength = 0;
        healer.agility = 5;
        healer.intelligence = 10;
        healer.name = "Mikudayo";
        healer.HP = 100;
        healer.sayMyAttributes();
        healer.SPCITM = "'The Ring of UwUs'";
        healer.sayMySpecialITM();
    }
}
