import java.util.Scanner;

public class Hero {
    private String name;
    private int level;
    private int experience;
    private int strength;
    private int defence;
    private int intelligence;
    private int dexterity;
    private int agility;
    private int speed;
    private CharacterClass characterClass;
    private int points;

    public Hero(String name, CharacterClass characterClass) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.strength = 0;
        this.defence = 0;
        this.intelligence = 0;
        this.dexterity = 0;
        this.agility = 0;
        this.speed = 0;
        this.characterClass = characterClass;
        this.points = 0;
    }

    public void levelUp(){
        this.level++;
        this.experience = 0;
        this.points += 10;
    }

    public void addExperience()
    {
        if(points==0){
            System.out.println("You have no skill upgrade points.");
        } else {
            int remainingPoints = this.points;
            while (remainingPoints > 0) {
                System.out.println("You have " + remainingPoints + " experience points. How do you want to allocate them?");
                System.out.println("1. Strength: " + this.strength);
                System.out.println("2. Defence: " + this.defence);
                System.out.println("3. Intelligence: " + this.intelligence);
                System.out.println("4. Dexterity: " + this.dexterity);
                System.out.println("5. Agility: " + this.agility);
                System.out.println("6. Speed: " + this.speed);
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch(choice) {
                    case (1):
                        this.strength += 1;
                        remainingPoints -= 1;
                        break;
                    case (2):
                        this.defence += 1;
                        remainingPoints -= 1;
                        break;
                    case (3):
                        this.intelligence += 1;
                        remainingPoints -= 1;
                        break;
                    case (4):
                        this.dexterity += 1;
                        remainingPoints -= 1;
                        break;
                    case (5):
                        this.agility += 1;
                        remainingPoints -= 1;
                        break;
                    case (6):
                        this.speed += 1;
                        remainingPoints -= 1;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a number from 1 to 6.");
                        break;
                }
            }
        }
    }

    public boolean maxLevel(int level){
        if(level==100)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Character:\n" +
                "name='" + name + '\'' +
                ",\nlevel=" + level +
                ",\nexperience=" + experience +
                ",\nstrength=" + strength +
                ",\ndefence=" + defence +
                ",\nintelligence=" + intelligence +
                ",\ndexterity=" + dexterity +
                ",\nagility=" + agility +
                ",\nspeed=" + speed +
                ",\ncharacterClass=" + characterClass + "\n";
    }
}
