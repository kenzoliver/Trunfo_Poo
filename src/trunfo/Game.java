package src.trunfo;

import java.util.Scanner;

public class Game {
    public final static Scanner read = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        clearConsole();
        System.out.print(Colors.ANSI_WHITE_BACKGROUND);
        int i = 0;
        String player_name;

        Player p2 = new Player("COM");

        System.out.println(Colors.ANSI_YELLOW_BACKGROUND + "          WELCOME TO GAME          "
                + Colors.ANSI_RESET);
        System.out.printf("Enter the Player's name: ");
        player_name = read.nextLine();
        Player p1 = new Player(player_name);

        while (i < 11 && p1.getPoints() < 6 && p2.getPoints() < 6) {
            clearConsole();
            System.out.println(Colors.ANSI_WHITE_BACKGROUND + "New Round..." + Colors.ANSI_RESET);
            Thread.sleep(1000);
            clearConsole();
            String choice;
            int player, com;
            // player game
            while (true) {
                try {
                    p1.getCard(i);
                    Thread.sleep(1000);

                    System.out.printf("Choose an attribute: ");
                    choice = read.nextLine();
                    // As linhas 36 - 37 e 44 - 47 tem a mesma função a diferença é que ao inves do
                    // usuario digitar as cartas automatizamos a função de seleção apenas um pode
                    // estar rodando por vez
                    // Lines 36 - 37 and 39 - 42 have the same function, the difference is that instead of
                    // user enters the letters we automate the selection function only one can
                    // be running at a time
                    // System.out.println(player_name + " is choosing an attribute...");
                    // choice = p1.getBestAttribute(i);
                    // Thread.sleep(5000);
                    // System.out.println(player_name + " Chose: " + choice);
                    player = p1.getAtribute(i, choice);
                    com = p2.getAtribute(i, choice);
                    delaygame();
                    determineRoundWinner(p1, p2, player, com, player_name, i);
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
            determineRoundWinner(p1, p2, player, com, player_name, i);
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

    private static void determineRoundWinner(Player p1, Player p2, int playerAttr, int comAttr, String playerName,
            int i) throws InterruptedException {
        printCards(p1, p2, i, playerName);
        Thread.sleep(3000);
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
        System.out.println(Colors.ANSI_YELLOW_BACKGROUND + "          Score          " + Colors.ANSI_RESET);
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
        System.out.println(Colors.ANSI_PURPLE_BACKGROUND + "Go" + Colors.ANSI_RESET + "\n");
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

    public final static void printCards(Player p1, Player p2, int i, String player_name) {
        String[] atributos = { "Attack............", "Defense...........", "Speed.............", "Intelligence......",
                "Dribble...........", "Stamina..........." };
        int[] valoresP1 = { p1.deck[i].getAttack(), p1.deck[i].getDefense(), p1.deck[i].getSpeed(),
                p1.deck[i].getIntelligence(), p1.deck[i].getDribble(), p1.deck[i].getStamina() };
        int[] valoresP2 = { p2.deck[i].getAttack(), p2.deck[i].getDefense(), p2.deck[i].getSpeed(),
                p2.deck[i].getIntelligence(), p2.deck[i].getDribble(), p2.deck[i].getStamina() };

        System.out.printf(Colors.ANSI_BLUE_BACKGROUND + "%-24s" + Colors.ANSI_RESET, player_name);
        System.out.printf("%15s", "");
        System.out.printf(Colors.ANSI_RED_BACKGROUND + "%-24s" + Colors.ANSI_RESET + "\n", "COM");

        // Print all cards attributes
        for (int j = 0; j < atributos.length; j++) {
            System.out.print(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK);
            System.out.printf("%-20s %-3d", atributos[j], valoresP1[j]);
            System.out.print(Colors.ANSI_RESET);
            System.out.printf("%-15s", "");
            System.out.print(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK);
            System.out.printf("%-20s %-3d" + Colors.ANSI_RESET + "\n", atributos[j], valoresP2[j]);
        }

        System.out.println(""); // line space

    }
}
