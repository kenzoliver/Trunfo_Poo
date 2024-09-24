package trunfo;
import java.util.Random;

public class Card {
    Random valueGenerator = new Random();
    
    int attack = valueGenerator.nextInt(101);
    int defense = valueGenerator.nextInt(101);
    int speed = valueGenerator.nextInt(101);
    int intelligence = valueGenerator.nextInt(101);
    int stamina = valueGenerator.nextInt(101);


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
    
    public void getAllAtributes(){
        System.out.println("Attack:"+this.attack);
        System.out.println("Defense:"+this.defense);
        System.out.println("Speed:"+this.speed);
        System.out.println("Intelligence:"+this.intelligence);
        System.out.println("Stamina:"+this.stamina);
        System.out.println("");
    }
}
