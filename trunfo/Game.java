package trunfo;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        
        int i = 0;
        String player_name;

        Player p2 = new Player("COM");
        
        System.out.println(Colors.ANSI_YELLOW_BACKGROUND + "          WELCOME TO GAME          " + Colors.ANSI_RESET);
        System.out.printf("Informe o nome do Jogador:");
        player_name = read.nextLine();
        Player p1 = new Player(player_name);
        
        while (true) {
            String choice;
            int player, com;

            p1.getCard(i);
            System.out.printf("Escolha um atributo:");
            choice = read.nextLine();

            try { 
                player = p1.getAtribute(i, choice);
                com = p2.getAtribute(i, choice);
                System.out.println(player);
                System.out.println(com);
                if (player > com){
                    System.out.println(player_name+" ganhou essa rodada");
                }
                if (player < com){
                    System.out.println("COM ganhou essa rodada");
                }
                else{
                    System.out.println("Empate");
                }
            }

            catch (Exception e) { 
                System.out.println("O Usuario digitou algo errado tem que ver como faz pra não deixar passar pra proxima rodada "+ e.getMessage());
             }
            p2.getCard(i);
            Thread.sleep(2000);
        }
    }
}
