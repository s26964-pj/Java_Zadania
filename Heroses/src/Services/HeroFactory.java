package Services;

import java.util.Random;
import Hero.Mage;
import Hero.Archer;
import Hero.Knight;
import Hero.Hero;
import java.util.Scanner;
public class HeroFactory {

    public String getRandomName() {
        String[] names = {"Anna", "John", "Emily", "Michael", "Emma", "David", "Olivia", "Daniel", "Sophia", "James", "Isabella", "Matthew", "Mia", "Alexander", "Ava"};
        Random random = new Random();
        int index = random.nextInt(names.length);
        return names[index];
    }
    public String getRandomClas() {
        String[] clas = {"Mage","Archer","Knight"};
        Random random = new Random();
        int index = random.nextInt(clas.length);
        return clas[index];
    }
    public Hero createHero(String characterClass){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię bohatera: ");
        String name = scanner.next();
        Hero hero = null;
        switch(characterClass) {
            case "Mage":
                hero = new Mage(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Mage");
                return hero;
            case "Archer":
                hero = new Archer(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Archer");
                return hero;
            case "Knight":
                hero = new Knight(name, 0, 1, 1, 1, 1, 1, 1, 1, 0, "Knight");
                return hero;
        }
        return hero;
    }

}
