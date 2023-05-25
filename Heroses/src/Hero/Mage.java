package Hero;

import Hero.Hero;

public class Mage extends Hero {
    private String name;
    private int experience;
    private int level;
    private int strength;
    private int intelligence;
    private int defence;
    private int dexterity;
    private int agility;
    private int speed;
    private int points;

    public Mage(String name, String characterClass){
        super(name);
        this.experience = 0;
        this.level = 1;
        this.strength = 1;
        this.defence = 1;
        this.intelligence = 1;
        this.dexterity = 1;
        this.agility = 1;
        this.speed = 1;
        this.points = 0;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
