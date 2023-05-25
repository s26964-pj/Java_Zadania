package Services;

import Hero.Archer;
import Hero.Mage;

import java.util.Scanner;
public class ArcherServices {
    public void addExperience(Archer archer)
    {
        if(archer.getPoints()==0){
            System.out.println("You have no skill upgrade points.");
        } else {
            int remainingPoints = archer.getPoints();
            while (remainingPoints > 0) {
                System.out.println("You have " + remainingPoints + " experience points. How do you want to allocate them?");
                System.out.println("1. Strength: " + archer.getStrength());
                System.out.println("2. Defence: " + archer.getDefence());
                System.out.println("3. Intelligence: " + archer.getIntelligence());
                System.out.println("4. Dexterity: " + archer.getDexterity());
                System.out.println("5. Agility: " + archer.getAgility());
                System.out.println("6. Speed: " + archer.getSpeed());
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch(choice) {
                    case (1):
                        archer.setStrength(archer.getStrength()+1);
                        remainingPoints -= 1;
                        break;
                    case (2):
                        archer.setDefence(archer.getDefence()+1);
                        remainingPoints -= 1;
                        break;
                    case (3):
                        archer.setIntelligence(archer.getIntelligence()+1);
                        remainingPoints -= 1;
                        break;
                    case (4):
                        archer.setDexterity(archer.getDexterity()+1);
                        remainingPoints -= 1;
                        break;
                    case (5):
                        archer.setAgility(archer.getAgility()+1);
                        remainingPoints -= 1;
                        break;
                    case (6):
                        archer.setSpeed(archer.getSpeed()+1);
                        remainingPoints -= 1;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a number from 1 to 6.");
                        break;
                }
            }
        }
    }

    public void levelUp(Archer archer){
        archer.setLevel(archer.getLevel()+1);
        archer.setExperience(0);
        archer.setPoints(archer.getPoints()+10);
    }

    public boolean maxLevel(Archer archer){
        if(archer.getLevel()==100)
            return true;
        return false;
    }
}
