package Game;

import Hero.Mage;
import Hero.Archer;
import Hero.Knight;
import Services.HeroFactory;
import Services.HeroServices;
import Hero.Hero;

import java.util.Scanner;

public class Menu {
    HeroServices heroServices = new HeroServices();
    HeroFactory heroFactory = new HeroFactory();
    Scanner scanner = new Scanner(System.in);
    char x = '1';
    Hero hero;

    public void gra() {
        x = 0;
        hero = createHero1();
        play(hero);
    }

    public Hero createHero1() {
        System.out.println("******Start Gry******");
        System.out.println("Tworzenie bohatera");
        System.out.println("1 - Mage");
        System.out.println("2 - Archer");
        System.out.println("3 - Knight");
        x = scanner.next().charAt(0);
        switch (x) {
            case '1':
                Mage mage = (Mage) heroFactory.createHero("Mage");
                System.out.println("Stworzono postać: " + mage.getName());
                return mage;
            case '2':
                Archer archer = (Archer) heroFactory.createHero("Archer");
                System.out.println("Stworzono postać: " + archer.getName());
                return archer;
            case '3':
                Knight knight = (Knight) heroFactory.createHero("Knight");
                System.out.println("Stworzono postać: " + knight.getName());
                return knight;
            default:
                return null;
        }
    }
    public void play(Hero hero) {
        while (x != 0) {
            System.out.println("1 - Dodaj level postaci");
            System.out.println("2 - Rozdziel punkty umiejętności");
            System.out.println("3 - Wyświetl punkty umiejętności");
            System.out.println("0 - Koniec gry");
            x = scanner.next().charAt(0);
            switch (x) {
                case '1':
                    heroServices.levelUp(hero);
                    break;
                case '2':
                    heroServices.addSkillPoints(hero);
                    break;
                case '3':
                    hero.getName();
                    System.out.println("Imię: " + hero.getName());
                    heroServices.calculateModifiers(hero);
                    break;
                case '0':
                    exitGame();
                    break;
            }
        }
    }
    public void exitGame() {
        System.out.println("Koniec gry.");
        System.exit(0);
    }
}
