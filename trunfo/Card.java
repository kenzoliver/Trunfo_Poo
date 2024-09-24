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
    
    public void getAllAtributes(){ // this function return all atributes of card, will be displayed for the user to choose the attribute he wants
        System.out.println("Attack:"+this.attack);
        System.out.println("Defense:"+this.defense);
        System.out.println("Speed:"+this.speed);
        System.out.println("Intelligence:"+this.intelligence);
        System.out.println("Dribble:"+this.dribble);
        System.out.println("Stamina:"+this.stamina);
        System.out.println("");
    }
}
