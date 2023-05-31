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
    public void addSkillPoints(Hero hero)
    {
        if(hero.getPoints()==0){
            System.out.println("You have no skill upgrade points.");
        } else {
            int remainingPoints = hero.getPoints();
            while (remainingPoints > 0) {
                System.out.println("You have " + remainingPoints + " experience points. How do you want to allocate them?");
                System.out.println("1. Strength: " + hero.getStrength());
                System.out.println("2. Defence: " + hero.getDefence());
                System.out.println("3. Intelligence: " + hero.getIntelligence());
                System.out.println("4. Dexterity: " + hero.getDexterity());
                System.out.println("5. Agility: " + hero.getAgility());
                System.out.println("6. Speed: " + hero.getSpeed());
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch(choice) {
                    case (1):
                        hero.setStrength(hero.getStrength()+1);
                        remainingPoints -= 1;
                        break;
                    case (2):
                        hero.setDefence(hero.getDefence()+1);
                        remainingPoints -= 1;
                        break;
                    case (3):
                        hero.setIntelligence(hero.getIntelligence()+1);
                        remainingPoints -= 1;
                        break;
                    case (4):
                        hero.setDexterity(hero.getDexterity()+1);
                        remainingPoints -= 1;
                        break;
                    case (5):
                        hero.setAgility(hero.getAgility()+1);
                        remainingPoints -= 1;
                        break;
                    case (6):
                        hero.setSpeed(hero.getSpeed()+1);
                        remainingPoints -= 1;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a number from 1 to 6.");
                        break;
                }
            }
        }
    }
    public void levelUp(Hero hero){
        hero.setLevel(hero.getLevel()+1);
        hero.setExperience(0);
        hero.setPoints(hero.getPoints()+10);
    }

    public boolean maxLevel(Hero hero){
        if(hero.getLevel()==100)
            return true;
        return false;
    }
    public ModifierAbilities setModifier(Hero hero){
        ModifierAbilities modifierAbilities = hero.getModifierAbilities();
        Modifier modifier;

        if(hero instanceof Mage) {
            modifier = new MageModifier();
        } else if(hero instanceof Archer) {
            modifier = new ArcherModifier();
        } else if (hero instanceof Knight) {
            modifier = new KnightModifier();
        } else {
                return modifierAbilities;
            }
        modifier.setModifiers(modifierAbilities);
        return modifierAbilities;
    }
}
