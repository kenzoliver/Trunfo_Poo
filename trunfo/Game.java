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
            String choice;
            p1.getCard(i);
            System.out.printf("Escolha um atributo:");
            choice = read.nextLine();

            try { 
                System.out.println(p1.getAtribute(i, choice));
            }

            catch (Exception e) { 
                System.out.println("O Usuario digitou algo errado tem que ver como faz pra não deixar passar pra proxima rodada "+ e.getMessage());
             }
            p2.getCard(i);
            Thread.sleep(2000);
        }
    }
}
