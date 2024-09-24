package trunfo;

public class Player {

    private String name;
    private Card[] deck = new Card[11];

    public Player(String name){
        this.name = name;
        // System.out.println("Player:" + name +"\n");
        for (int i = 0; i < 11; i++) {
            deck[i] = new Card();
        }
    }
    public void getCard(int i){
        System.out.println(Colors.ANSI_GREEN_BACKGROUND + "Carta:" + (i + 1) + Colors.ANSI_RESET + '\n');
        deck[i].getAllAtributes();
    }
}