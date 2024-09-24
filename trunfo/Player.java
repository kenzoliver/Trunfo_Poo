package trunfo;

public class Player {

    private String name;
    private Card[] deck = new Card[11];
    private int points;

    public Player(String name) {
        this.name = name;

        for (int i = 0; i < 11; i++) {
            deck[i] = new Card();
        }
    }

    public void addPoint() {
        points += 1;
    }

    public int getPoints() {
        return points;
    }

    public void getCard(int i) {
        System.out.println(Colors.ANSI_BLUE_BACKGROUND + "Player:" + name + "\n" + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_GREEN_BACKGROUND + "Carta:" + (i + 1) + Colors.ANSI_RESET + '\n');
        deck[i].getAllAtributes();
    }

    public String getBestAttribute(int i) {
        return deck[i].getBetterAtribute();
    }

    public int getAtribute(int i, String atribute) {
        switch (atribute) {
            case "Attack":
                return deck[i].getAttack();
            case "Defense":
                return deck[i].getDefense();
            case "Speed":
                return deck[i].getSpeed();
            case "Intelligence":
                return deck[i].getIntelligence();
            case "Stamina":
                return deck[i].getStamina();
            case "Dribble":
                return deck[i].getDribble();
            default:
                throw new IllegalArgumentException("Atributo inválido: " + atribute);

        }
    }
}