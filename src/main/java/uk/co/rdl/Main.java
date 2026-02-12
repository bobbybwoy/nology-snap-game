package uk.co.rdl;

import uk.co.rdl.games.CardGame;
import uk.co.rdl.games.Snap;

import java.util.Scanner;

public class Main {
    static void main() {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);
        String playerName = "";

        // Get the players
        System.out.print("Enter Player 1's name: ");
        playerName = scanner.nextLine();
        Player player1 = new Player(playerName);

        System.out.print("Enter Player 2's name: ");
        playerName = scanner.nextLine();
        Player player2 = new Player(playerName);

        // Create the Snap game
        Snap snap = new Snap("Snap!", player1, player2);
        snap.shuffleDeck();
        snap.play();
    }
}
