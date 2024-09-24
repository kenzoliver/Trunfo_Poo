package trunfo;
public class Player{

    private String name;
    private Card[] deck = new Card[11];

    public Player(String name){
        this.name = name;
        for (int i = 0; i < 11; i++) {
            deck[i] = new Card(); 
            deck[i].getAllAtributes();
        }
    }
}