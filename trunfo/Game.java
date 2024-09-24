package trunfo;

import java.util.Scanner;

public class Game {
    public final static Scanner read = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        String player_name;

        Player p2 = new Player("COM");

        System.out.println(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_GREEN + "          WELCOME TO GAME          "
                + Colors.ANSI_RESET);
        System.out.printf("Enter the Player's name: ");
        player_name = read.nextLine();
        Player p1 = new Player(player_name);

        while (i < 11 && p1.getPoints() < 5 && p2.getPoints() < 5) {
            clearConsole();
            String choice;
            int player, com;
            // player game
            while (true) {
                try {
                    p1.getCard(i);
                    Thread.sleep(1000);

                    // System.out.printf("Choose an attribute:");
                    // choice = read.nextLine();
                    System.out.println(player_name + " is choosing an attribute...");
                    choice = p1.getBestAttribute(i);
                    Thread.sleep(5000);
                    System.out.println(player_name + " Chose:" + choice);
                    player = p1.getAtribute(i, choice);
                    com = p2.getAtribute(i, choice);
                    delaygame();
                    determineRoundWinner(p1, p2, player, com, player_name);
                    Thread.sleep(1000);
                    displayScore(p1, p2);
                    i += 1;
                    break;
                } catch (Exception e) {
                    System.out.println("This is Not a attribute, type as it is in the letter " + e.getMessage());
                    Thread.sleep(3000);
                    clearConsole();
                }
            }
            // COM game
            p1.getCard(i);
            System.out.println("COM is choosing an attribute...");
            Thread.sleep(5000);
            choice = p2.getBestAttribute(i);
            System.out.println("COM chose: " + choice);
            player = p1.getAtribute(i, choice);
            com = p2.getAtribute(i, choice);
            delaygame();
            determineRoundWinner(p1, p2, player, com, player_name);
            Thread.sleep(1000);
            displayScore(p1, p2);
            i += 1;
        }
        displayWinner(p1, p2, player_name);
    }

    private static void displayWinner(Player p1, Player p2, String playerName) {
        if (p1.getPoints() > p2.getPoints()) {
            System.out.println(
                    Colors.ANSI_GREEN_BACKGROUND + Colors.ANSI_BLACK + playerName + " WIN!" + Colors.ANSI_RESET);
        } else if (p1.getPoints() < p2.getPoints()) {
            System.out.println(Colors.ANSI_RED_BACKGROUND + Colors.ANSI_WHITE + "COM WIN!" + Colors.ANSI_RESET);
        } else {
            System.out.println(Colors.ANSI_YELLOW_BACKGROUND + Colors.ANSI_WHITE + "DRAW!" + Colors.ANSI_RESET);
        }
    }

    private static void determineRoundWinner(Player p1, Player p2, int playerAttr, int comAttr, String playerName) {
        if (playerAttr > comAttr) {
            p1.addPoint();
            System.out.println(Colors.ANSI_GREEN_BACKGROUND + playerName + " Win this round" + Colors.ANSI_RESET);
        } else if (playerAttr < comAttr) {
            p2.addPoint();
            System.out.println(Colors.ANSI_RED_BACKGROUND + "COM Win this round" + Colors.ANSI_RESET);
        } else {
            System.out.println(Colors.ANSI_YELLOW_BACKGROUND + "Draw" + Colors.ANSI_RESET);
        }

    }

    private static void displayScore(Player p1, Player p2) throws InterruptedException {
        System.out.println(Colors.ANSI_YELLOW_BACKGROUND + "          Placar          " + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_GREEN + "Player: " + p1.getPoints() + Colors.ANSI_RESET + "         "
                + Colors.ANSI_RED + "COM: " + p2.getPoints() + Colors.ANSI_RESET);
        Thread.sleep(2000);
        clearConsole();

    }

    private static void delaygame() throws InterruptedException {
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println(Colors.ANSI_PURPLE_BACKGROUND + "Go" + Colors.ANSI_RESET);
        Thread.sleep(1000);

    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {

                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println(Colors.ANSI_RED_BACKGROUND + "Error!" + Colors.ANSI_RESET);
        }
    }
}
