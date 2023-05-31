package Game;

import Hero.Mage;
import Hero.Archer;
import Services.HeroFactory;
import Services.HeroServices;
import java.util.Scanner;

public class Main {
/*    public static void main(String[] args) {
        HeroServices heroServices = new HeroServices();
        Archer archer = (Archer) HeroFactory.createHero("Dominik", "Archer");
        heroServices.setModifier(archer);
        System.out.println(archer.toString());
    }*/
public static void main(String[] args) {
    Menu menu = new Menu();
    menu.gra();
}
}