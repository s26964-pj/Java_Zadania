package Services;

import Hero.Knight;
import java.util.Scanner;
public class KnightServies {
    public void addExperience(Knight knight)
    {
        if(knight.getPoints()==0){
            System.out.println("You have no skill upgrade points.");
        } else {
            int remainingPoints = knight.getPoints();
            while (remainingPoints > 0) {
                System.out.println("You have " + remainingPoints + " experience points. How do you want to allocate them?");
                System.out.println("1. Strength: " + knight.getStrength());
                System.out.println("2. Defence: " + knight.getDefence());
                System.out.println("3. Intelligence: " + knight.getIntelligence());
                System.out.println("4. Dexterity: " + knight.getDexterity());
                System.out.println("5. Agility: " + knight.getAgility());
                System.out.println("6. Speed: " + knight.getSpeed());
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch(choice) {
                    case (1):
                        knight.setStrength(knight.getStrength()+1);
                        remainingPoints -= 1;
                        break;
                    case (2):
                        knight.setDefence(knight.getDefence()+1);
                        remainingPoints -= 1;
                        break;
                    case (3):
                        knight.setIntelligence(knight.getIntelligence()+1);
                        remainingPoints -= 1;
                        break;
                    case (4):
                        knight.setDexterity(knight.getDexterity()+1);
                        remainingPoints -= 1;
                        break;
                    case (5):
                        knight.setAgility(knight.getAgility()+1);
                        remainingPoints -= 1;
                        break;
                    case (6):
                        knight.setSpeed(knight.getSpeed()+1);
                        remainingPoints -= 1;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a number from 1 to 6.");
                        break;
                }
            }
        }
    }

    public void levelUp(Knight knight){
        knight.setLevel(knight.getLevel()+1);
        knight.setExperience(0);
        knight.setPoints(knight.getPoints()+10);
    }

    public boolean maxLevel(Knight knight){
        if(knight.getLevel()==100)
            return true;
        return false;
    }
}
