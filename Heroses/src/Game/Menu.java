package Game;
import Hero.Mage;
import Hero.Archer;
import Hero.Knight;
import Services.HeroFactory;
import Services.HeroServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {
    static List<Mage> createdMages = new ArrayList<>();
    static List<Archer> createdArchers = new ArrayList<>();
    static List<Knight> createdKnights = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static char x = '1';
    public static void gra() {
        while (x != '0') {
            DisplayMenu();
            x = scanner.next().charAt(0);
            switch (x) {
                case '1':
                    play();
                    break;
                case '2':
                    createHero();
                    break;
                case '0':
                    exitGame();
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
                    break;
            }
        }
    }
    public static void DisplayMenu() {
        System.out.println("*****Gra******");
        System.out.println("1 - Graj");
        System.out.println("2 - Stwórz bohatera");
        System.out.println("0 - Koniec");
    }

    public static void play() {
        System.out.println("Rozpoczęto grę!");
        System.out.println("1 - Dodaj level postaci");
    }

    public static void createHero() {
        String name;
        String characterClass;
        System.out.println("Tworzenie bohatera");
        System.out.println("1 - Losowe imię");
        System.out.println("2 - Podaj imię");
        System.out.println("3 - Wróć");
        while (true) {
            x = scanner.next().charAt(0);
            switch (x) {
                case '1':
                    System.out.print("Podaj postać [Mage, Archer, Knight]: ");
                    characterClass = scanner.next();
                    if (characterClass.equals("Mage") || characterClass.equals("Archer") || characterClass.equals("Knight")) {
                        if (characterClass.equals("Mage")) {
                            Mage mage = (Mage) HeroFactory.createRandomHero("Mage");
                            System.out.println("Stworzono postać: " + mage.getName());
                            return;
                        } else if (characterClass.equals("Archer")) {
                            Archer archer = (Archer) HeroFactory.createRandomHero("Archer");
                            System.out.println("Stworzono postać: " + archer.getName());
                            return;
                        } else if (characterClass.equals("Knight")) {
                            Knight knight = (Knight) HeroFactory.createRandomHero("Archer");
                            System.out.println("Stworzono postać: " + knight.getName());
                            return;
                        }
                    } else {
                        while (!characterClass.equals("Mage") && !characterClass.equals("Archer") && !characterClass.equals("Knight")) {
                            System.out.print("Niepoprawna postać. Spróbuj ponownie: ");
                            characterClass = scanner.next();
                        }
                        if (characterClass.equals("Mage")) {
                            Mage mage = (Mage) HeroFactory.createRandomHero("Mage");
                            System.out.println("Stworzono postać: " + mage.getName());
                            return;
                        } else if (characterClass.equals("Archer")) {
                            Archer archer = (Archer) HeroFactory.createRandomHero("Archer");
                            System.out.println("Stworzono postać: " + archer.getName());
                            return;
                        } else if (characterClass.equals("Knight")) {
                            Knight knight = (Knight) HeroFactory.createRandomHero("Knight");
                            System.out.println("Stworzono postać: " + knight.getName());
                            return;
                        }
                    }
                    break;
                case '2':
                    System.out.print("Podaj imię: ");
                    name = scanner.next();
                    System.out.print("Podaj postać [Mage, Archer, Knight]: ");
                    characterClass = scanner.next();
                    if (characterClass.equals("Mage") || characterClass.equals("Archer") || characterClass.equals("Knight")) {
                        if (characterClass.equals("Mage")) {
                            createMage(name);
                            return;
                        } else if (characterClass.equals("Archer")) {
                            createArcher(name);
                            return;
                        } else if (characterClass.equals("Knight")) {
                            createKnight(name);
                            return;
                        }
                    } else {
                        while (!characterClass.equals("Mage") && !characterClass.equals("Archer") && !characterClass.equals("Knight")) {
                            System.out.print("Niepoprawna postać. Spróbuj ponownie: ");
                            characterClass = scanner.next();
                        }
                        if (characterClass.equals("Mage")) {
                            createMage(name);
                            return;
                        } else if (characterClass.equals("Archer")) {
                            createArcher(name);
                            return;
                        } else if (characterClass.equals("Knight")) {
                            createKnight(name);
                            return;
                        }
                    }
                    break;
            }
        }
    }
    public static void displayCreatedHeroes() {
        System.out.println("Utworzone postacie:");
        System.out.println("Mages:");
        for (Mage mage : createdMages) {
            System.out.println(mage.getName());
        }
        System.out.println("Archers:");
        for (Archer archer : createdArchers) {
            System.out.println(archer.getName());
        }
        System.out.println("Knights:");
        for (Knight knight : createdKnights) {
            System.out.println(knight.getName());
        }
    }
    private static Mage createMage(String name) {
        Mage mage = (Mage) HeroFactory.createHero(name, "Mage");
        System.out.println("Stworzono postać: " + mage.getName());
        createdMages.add(mage);
        return mage;
    }

    private static Archer createArcher(String name) {
        Archer archer = (Archer) HeroFactory.createHero(name, "Archer");
        System.out.println("Stworzono postać: " + archer.getName());
        createdArchers.add(archer);
        return archer;
    }

    private static Knight createKnight(String name) {
        Knight knight = (Knight) HeroFactory.createHero(name, "Knight");
        System.out.println("Stworzono postać: " + knight.getName());
        createdKnights.add(knight);
        return knight;
    }

    public static void exitGame () {
        System.out.println("Koniec gry.");
        System.exit(0);
    }
}
