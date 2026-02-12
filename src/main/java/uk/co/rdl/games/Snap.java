package uk.co.rdl.games;

import uk.co.rdl.Player;
import uk.co.rdl.cards.Card;

import java.util.Scanner;

public class Snap extends CardGame {
    private Player playerOne;
    private Player playerTwo;

    public Snap(String name, Player playerOne, Player playerTwo) {
        super(name);
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Card takeTurn(String playerName) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s, take card ", playerName);
        scanner.nextLine();
        Card card = this.dealCard();
        System.out.printf("%s's is %s\n", playerName, card.displayCard());
        return card;
    }

    public boolean play() {
        boolean isItPlayerOneTurn = true;
        Card playerOneCard = this.takeTurn(this.playerOne.getPlayerName());
        Card playerTwoCard = this.takeTurn(this.playerTwo.getPlayerName());

        while (true) {
            if (playerOneCard.getValue() == (playerTwoCard.getValue())) {
                System.out.println("SNAP!!! " + (!isItPlayerOneTurn ? this.playerOne.getPlayerName() : this.playerTwo.getPlayerName()) + " wins!");
                return true;
            }

            if (isItPlayerOneTurn) {
                playerOneCard = this.takeTurn(this.playerOne.getPlayerName());
            } else {
                playerTwoCard = this.takeTurn(this.playerTwo.getPlayerName());
            }
            isItPlayerOneTurn = !isItPlayerOneTurn;
        }
    }
}
