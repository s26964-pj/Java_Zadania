package Services;

import Hero.Hero;
import Hero.Knight;
import Hero.Archer;
import Hero.Mage;
import Modifier.MageModifier;
import Modifier.ArcherModifier;
import Modifier.KnightModifier;
import Modifier.Modifier;
import Modifier.ModifierAbilities;

import java.util.Scanner;

public class HeroServices {
    public void addSkillPoints(Hero hero) {
        if (hero.getPoints() == 0) {
            System.out.println("Nie masz punktów ulepszeń umiejętności.");
        } else {
            int remainingPoints = hero.getPoints();
            while (remainingPoints > 0) {
                System.out.println("Masz " + remainingPoints + " punktów doświadczenia. Jak chcesz je rozdysponować?");
                System.out.println("1. Siła: " + hero.getStrength());
                System.out.println("2. Obrona: " + hero.getDefence());
                System.out.println("3. Intelignecja: " + hero.getIntelligence());
                System.out.println("4. Zręczność: " + hero.getDexterity());
                System.out.println("5. Zwinność: " + hero.getAgility());
                System.out.println("6. Prędkość: " + hero.getSpeed());
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case (1):
                        hero.setStrength(hero.getStrength() + 1);
                        remainingPoints -= 1;
                        break;
                    case (2):
                        hero.setDefence(hero.getDefence() + 1);
                        remainingPoints -= 1;
                        break;
                    case (3):
                        hero.setIntelligence(hero.getIntelligence() + 1);
                        remainingPoints -= 1;
                        break;
                    case (4):
                        hero.setDexterity(hero.getDexterity() + 1);
                        remainingPoints -= 1;
                        break;
                    case (5):
                        hero.setAgility(hero.getAgility() + 1);
                        remainingPoints -= 1;
                        break;
                    case (6):
                        hero.setSpeed(hero.getSpeed() + 1);
                        remainingPoints -= 1;
                        break;
                    default:
                        System.out.println("Nieprawidłowy wybór. Proszę wybrać numer od 1 do 6.");
                        break;
                }
            }
        }
    }

    public void levelUp(Hero hero) {
        if (maxLevel(hero) == false) {
            if (hero.getLevel() == 1) {
                hero.setPoints(hero.getPoints() + 9);
                hero.setLevel(hero.getLevel() + 1);
                hero.setExperience(0);
            } else {
                hero.setLevel(hero.getLevel() + 1);
                hero.setExperience(0);
                hero.setPoints(hero.getPoints() + 10);
            }
        } else {
            System.out.println("Osiągnąłeś maksymalny level");
        }
    }

    public boolean maxLevel(Hero hero) {
        if (hero.getLevel() == 100)
            return true;
        return false;
    }

    public ModifierAbilities setModifier(Hero hero) {
        ModifierAbilities modifierAbilities = hero.getModifierAbilities();
        Modifier modifier;

        if (hero instanceof Mage) {
            modifier = new MageModifier();
        } else if (hero instanceof Archer) {
            modifier = new ArcherModifier();
        } else if (hero instanceof Knight) {
            modifier = new KnightModifier();
        } else {
            return modifierAbilities;
        }
        modifier.setModifiers(modifierAbilities);
        return modifierAbilities;
    }

    //    public void calculateModifier(Hero hero){
//        ModifierAbilities modifierAbilities = hero.getModifierAbilities();
//        setModifier(hero);
//        float resultStrength = hero.getStrength() * hero.getModifierAbilities().getStrengthModifier();
//        System.out.println(resultStrength);
//        float resultDefence = hero.getDefence() * hero.getModifierAbilities().getDefenceModifier();
//        System.out.println(resultDefence);
//        float resultIntelligence = hero.getIntelligence() * hero.getModifierAbilities().getIntelligenceModifier();
//        System.out.println(resultIntelligence);
//        float resultDexterity = hero.getDexterity() * hero.getModifierAbilities().getDexterityModifier();
//        System.out.println(resultDexterity);
//        float resultAgility = hero.getAgility() * hero.getModifierAbilities().getAgilityModifier();
//        System.out.println(resultAgility);
//        float resultSpeed = hero.getSpeed() * hero.getModifierAbilities().getSpeedModifier();
//        System.out.println(resultSpeed);
//    }
    public void calculateModifiers(Hero hero) {
        ModifierAbilities modifierAbilities = hero.getModifierAbilities();
        setModifier(hero);

        float resultStrength = hero.getStrength() * modifierAbilities.getStrengthModifier();
        float resultDefence = hero.getDefence() * modifierAbilities.getDefenceModifier();
        float resultIntelligence = hero.getIntelligence() * modifierAbilities.getIntelligenceModifier();
        float resultDexterity = hero.getDexterity() * modifierAbilities.getDexterityModifier();
        float resultAgility = hero.getAgility() * modifierAbilities.getAgilityModifier();
        float resultSpeed = hero.getSpeed() * modifierAbilities.getSpeedModifier();

        printModifiers(resultStrength, resultDefence, resultIntelligence, resultDexterity, resultAgility, resultSpeed);
    }

    public void printModifiers(float strength, float defence, float intelligence, float dexterity, float agility, float speed) {
        System.out.println("Strength: " + strength);
        System.out.println("Defence: " + defence);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Agility: " + agility);
        System.out.println("Speed: " + speed);
    }
}
