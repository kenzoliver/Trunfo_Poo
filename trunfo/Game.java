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

        while (i < 10 && p1.getPoints() < 6 && p2.getPoints() < 6) {
            String choice;
            int player, com;
            // player game
            while (true) {
                try {
                    p1.getCard(i);
                    System.out.printf("Escolha um atributo:");
                    choice = read.nextLine();
                    player = p1.getAtribute(i, choice);
                    com = p2.getAtribute(i, choice);
                    if (player > com) {
                        p1.addPoint();
                        System.out.println(Colors.ANSI_GREEN_BACKGROUND + player_name + " ganhou essa rodada"
                                + Colors.ANSI_RESET + "\n");
                    }
                    if (player < com) {
                        p2.addPoint();
                        System.out.println(
                                Colors.ANSI_RED_BACKGROUND + "COM ganhou essa rodada" + Colors.ANSI_RESET + "\n");
                    }
                    if (player == com) {
                        System.out.println(Colors.ANSI_YELLOW_BACKGROUND + "Empate" + Colors.ANSI_RESET + "\n");
                    }
                    System.out
                            .println(Colors.ANSI_YELLOW_BACKGROUND + "          Placar          " + Colors.ANSI_RESET);
                    System.out.println(Colors.ANSI_GREEN + "Player:" + p1.getPoints() + Colors.ANSI_RESET + "  "
                            + Colors.ANSI_RED + "COM:" + p2.getPoints() + Colors.ANSI_RESET);
                    i += 1;
                    break;
                } catch (Exception e) {
                    System.out.println("Este não é um atributo, digite como está na carta " + e.getMessage());
                }
            }
            // COM game
            p2.getCard(i);
            System.out.println("COM está escolhendo um atributo...");
            Thread.sleep(2000);
            choice = p2.getBestAttribute(i);
            System.out.println("COM escolheu: " + choice);
            player = p1.getAtribute(i, choice);
            com = p2.getAtribute(i, choice);
            if (player > com) {
                p1.addPoint();
                System.out.println(Colors.ANSI_GREEN_BACKGROUND + player_name + " ganhou essa rodada"
                        + Colors.ANSI_RESET + "\n");
            }
            if (player < com) {
                p2.addPoint();
                System.out.println(
                        Colors.ANSI_RED_BACKGROUND + "COM ganhou essa rodada" + Colors.ANSI_RESET + "\n");
            }
            if (player == com) {
                System.out.println(Colors.ANSI_YELLOW_BACKGROUND + "Empate" + Colors.ANSI_RESET + "\n");
            }
            System.out
                    .println(Colors.ANSI_YELLOW_BACKGROUND + "          Placar          " + Colors.ANSI_RESET);
            System.out.println(Colors.ANSI_GREEN + "Player:" + p1.getPoints() + Colors.ANSI_RESET + "  "
                    + Colors.ANSI_RED + "COM:" + p2.getPoints() + Colors.ANSI_RESET);
            i += 1;
        }
        if (p1.getPoints() > p2.getPoints()) {
            System.out.println(player_name + "Venceu!");
        }
        if (p1.getPoints() < p2.getPoints()) {
            System.out.println("COM Venceu!");
        }
    }
}
