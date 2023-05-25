package Hero;

import java.util.Random;

public class Hero {
    private String name;

    public String getRandomName() {
        String[] names = {"Anna", "John", "Emily", "Michael", "Emma", "David", "Olivia", "Daniel", "Sophia", "James", "Isabella", "Matthew", "Mia", "Alexander", "Ava"};
        Random random = new Random();
        int index = random.nextInt(names.length);
        return names[index];
    }
    public Hero(String name) {
        this.name = name;
    }

    public Hero() {
        this.name = getRandomName();
    }
}

