package Game;

import Hero.Hero;
import Hero.Mage;
import Hero.Archer;
import Services.HeroFactory;
import Services.HeroServices;
import java.util.Scanner;

public class Main {
//        public static void main(String[] args) {
//        HeroServices heroServices = new HeroServices();
//        Archer archer = (Archer) HeroFactory.createHero("Dominik", "Archer");
//        heroServices.setModifier(archer);
//        System.out.println(archer.toString());
public static void main(String[] args) {
    Menu menu = new Menu();
    menu.gra();


//    String name = "Alex";
//    HeroFactory heroFactory = new HeroFactory();
//    HeroServices heroServices = new HeroServices();
//    Mage mage = (Mage) HeroFactory.createHero(name, "Mage");
//    heroServices.levelUp(mage);
//    System.out.println(mage.getLevel());
}
}