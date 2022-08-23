public class App {
    public static void main(String[] args) {

        Character knight = new Character(10, 5, 0, 80, "Chen");

        knight.sayMyAttributes();
        knight.SPCITM = "'The Shield of NoUs'";
        knight.sayMySpecialITM();

        Character mage = new Character(0, 5, 10, 50, "Akasha");

        mage.sayMyAttributes();

        Character thief = new Character(5, 10, 0, 60, "Gondar");

        thief.sayMyAttributes();

        Character healer = new Character(0, 5, 10, 100, "Mikudayo");

        healer.sayMyAttributes();
        healer.SPCITM = "'The Ring of UwUs'";
        healer.sayMySpecialITM();
    }
}
