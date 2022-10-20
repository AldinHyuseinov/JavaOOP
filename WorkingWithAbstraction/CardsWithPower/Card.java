package WorkingWithAbstraction.CardsWithPower;

import WorkingWithAbstraction.CardRank.CardRanks;
import WorkingWithAbstraction.CardSuit.CardSuits;

public class Card {
    CardRanks cardRank;
    CardSuits cardSuit;

    public Card(String cardRank, String cardSuit) {
        this.cardRank = CardRanks.valueOf(cardRank);
        this.cardSuit = CardSuits.valueOf(cardSuit);
    }

    public int power() {
        return cardRank.getPower() + cardSuit.getPower();
    }
}
