package trunfo;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        String player_name;
        System.out.println(Colors.ANSI_YELLOW_BACKGROUND + "          WELCOME TO GAME          " + Colors.ANSI_RESET);
        System.out.printf("Informe o nome do Jogador:");
        player_name = read.nextLine();
        Player p1 = new Player(player_name);
        Player p2 = new Player("COM");

        for (int i = 0; i < 11; i++) {
            p1.getCard(i);
        }
    }
}
