package trunfo;
public class Player{

    private String name;
    private Card[] deck = new Card[11];

    public Player(String name)  throws InterruptedException {
        this.name = name;
        System.out.println(name);
        for (int i = 0; i < 11; i++) {
            deck[i] = new Card(); 
            Thread.sleep(2000);
            deck[i].getAllAtributes();
        }
    }
}