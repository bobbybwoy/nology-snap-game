package uk.co.rdl.games;

import uk.co.rdl.cards.Card;

import java.util.Scanner;

public class Snap extends CardGame {

    public Snap(String name) {
        super(name);
    }

    public Card takeTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Take card ");
        scanner.nextLine();
        return this.dealCard();
    }

    public boolean play() {
        Card previousCard = null;
        Card currentCard = null;

        while (true) {
            currentCard = this.takeTurn();
            System.out.printf("Card dealt is %s\n", currentCard.displayCard());
            if (previousCard != null) {
                if (previousCard.getValue() == (currentCard.getValue())) {
                    System.out.println("SNAP!!!");
                    return true;
                }
            }
            previousCard = currentCard;
        }
    }
}
