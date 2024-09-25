package src.trunfo;
import java.util.Random;

public class Card {
    Random valueGenerator = new Random();

    // -1 was placed to avoid result 0
    int attack = valueGenerator.nextInt(100)+1;
    int defense = valueGenerator.nextInt(100)+1;
    int speed = valueGenerator.nextInt(100)+1;
    int intelligence = valueGenerator.nextInt(100)+1;
    int dribble = valueGenerator.nextInt(100)+1;
    int stamina = valueGenerator.nextInt(100)+1;


    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStamina() {
        return stamina;
    } 
    public int getDribble() {
        return dribble;
    }
    
    public String getBetterAtribute() {
        int maxIndex = 0;
        String[] attributes ={"Attack", "Defense", "Speed", "Intelligence", "Stamina", "Dribble"};
        int[] values = {attack, defense, speed, intelligence, stamina, dribble};
        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[maxIndex]) {
                maxIndex = i;
            }
        }
        return attributes[maxIndex];
    }
    
    public void getAllAtributes() {
        System.out.printf(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "%-20s %-3d" + Colors.ANSI_RESET + "\n", "Attack............", this.attack);
        System.out.printf(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "%-20s %-3d" + Colors.ANSI_RESET + "\n", "Defense...........", this.defense);
        System.out.printf(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "%-20s %-3d" + Colors.ANSI_RESET + "\n", "Speed.............", this.speed);
        System.out.printf(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "%-20s %-3d" + Colors.ANSI_RESET + "\n", "Intelligence......", this.intelligence);
        System.out.printf(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "%-20s %-3d" + Colors.ANSI_RESET + "\n", "Dribble...........", this.dribble);
        System.out.printf(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "%-20s %-3d" + Colors.ANSI_RESET + "\n", "Stamina...........", this.stamina);
        System.out.println("");
    }
}
