package Services;

import Hero.Mage;
import java.util.Scanner;

public class MageServices {

    public void addExperience(Mage mage)
    {
        if(mage.getPoints()==0){
            System.out.println("You have no skill upgrade points.");
        } else {
            int remainingPoints = mage.getPoints();
            while (remainingPoints > 0) {
                System.out.println("You have " + remainingPoints + " experience points. How do you want to allocate them?");
                System.out.println("1. Strength: " + mage.getStrength());
                System.out.println("2. Defence: " + mage.getDefence());
                System.out.println("3. Intelligence: " + mage.getIntelligence());
                System.out.println("4. Dexterity: " + mage.getDexterity());
                System.out.println("5. Agility: " + mage.getAgility());
                System.out.println("6. Speed: " + mage.getSpeed());
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch(choice) {
                    case (1):
                        mage.setStrength(mage.getStrength()+1);
                        remainingPoints -= 1;
                        break;
                    case (2):
                        mage.setDefence(mage.getDefence()+1);
                        remainingPoints -= 1;
                        break;
                    case (3):
                        mage.setIntelligence(mage.getIntelligence()+1);
                        remainingPoints -= 1;
                        break;
                    case (4):
                        mage.setDexterity(mage.getDexterity()+1);
                        remainingPoints -= 1;
                        break;
                    case (5):
                        mage.setAgility(mage.getAgility()+1);
                        remainingPoints -= 1;
                        break;
                    case (6):
                        mage.setSpeed(mage.getSpeed()+1);
                        remainingPoints -= 1;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a number from 1 to 6.");
                        break;
                }
            }
        }
    }

    public void levelUp(Mage mage){
        mage.setLevel(mage.getLevel()+1);
        mage.setExperience(0);
        mage.setPoints(mage.getPoints()+10);
    }

    public boolean maxLevel(Mage mage){
        if(mage.getLevel()==100)
            return true;
        return false;
    }
}
