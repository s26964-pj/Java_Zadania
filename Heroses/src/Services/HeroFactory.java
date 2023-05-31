package Services;

import java.util.Random;
import Hero.Mage;
import Hero.Archer;
import Hero.Knight;
import Hero.Hero;
public class HeroFactory {

    public static String getRandomName() {
        String[] names = {"Anna", "John", "Emily", "Michael", "Emma", "David", "Olivia", "Daniel", "Sophia", "James", "Isabella", "Matthew", "Mia", "Alexander", "Ava"};
        Random random = new Random();
        int index = random.nextInt(names.length);
        return names[index];
    }

    public static Hero createRandomHero(String characterClass){
        String name = getRandomName();
        Hero hero = null;
        switch(characterClass) {
            case "Mage":
                hero = new Mage(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Mage");
                break;
            case "Archer":
                hero = new Archer(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Archer");
                break;
            case "Knight":
                hero = new Knight(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Knight");
                break;
        }
        return hero;
    }
    public static Hero createHero(String name ,String characterClass){
        Hero hero = null;
        switch(characterClass) {
            case "Mage":
                hero = new Mage(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Mage");
                break;
            case "Archer":
                hero = new Archer(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Archer");
                break;
            case "Knight":
                hero = new Knight(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Knight");
                break;
        }
        return hero;
    }

}
