package trunfo;
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
        System.out.printf("%-20s %-3d " + Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Attack............" , this.attack + Colors.ANSI_RESET + "\n");
        System.out.printf("%-20s %-3d " + Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Defense..........." , this.defense + Colors.ANSI_RESET + "\n");
        System.out.printf("%-20s %-3d " + Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Speed............." , this.speed + Colors.ANSI_RESET + "\n");
        System.out.printf("%-20s %-3d " + Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Intelligence......" , this.intelligence + Colors.ANSI_RESET + "\n");
        System.out.printf("%-20s %-3d " + Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Dribble..........." , this.dribble + Colors.ANSI_RESET + "\n");
        System.out.printf("%-20s %-3d " + Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Stamina..........." , this.stamina + Colors.ANSI_RESET + "\n");
        System.out.println("");
    }
    
}
