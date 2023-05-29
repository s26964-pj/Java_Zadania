package Game;

import Services.HeroFactory;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static char x = '1';

    public static void main(String[] args) {
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
        // Logika gry
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
                        HeroFactory.createRandomHero(characterClass);
                        return;
                    } else {
                        while ((!characterClass.equals("Mage") && !characterClass.equals("Archer") && !characterClass.equals("Knight"))){
                            System.out.print("Niepoprawna postać. Spróbuj ponownie: ");
                            characterClass = scanner.next();
                        }
                        HeroFactory.createRandomHero(characterClass);
                    }
                    break;
                case '2':
                    System.out.print("Podaj imię: ");
                    name = scanner.next();
                    System.out.print("Podaj postać [Mage, Archer, Knight]: ");
                    characterClass = scanner.next();
                    if (characterClass.equals("Mage") && characterClass.equals("Archer") && characterClass.equals("Knight")) {
                        HeroFactory.createHero(name, characterClass);
                        return;
                    } else {
                        System.out.println("Niepoprawna postać. Spróbuj ponownie.");
                    }
                    break;
                case '3':
                    break;
            }
        }
    }

    public static void exitGame() {
        System.out.println("Koniec gry.");
        System.exit(0);
    }
}