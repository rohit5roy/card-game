package com.company.game.card.model;

public class Card {

    private final int suit;
    private final int rank;

    public Card(SUIT suit, int rank) {
        this.suit = suit.getId();
        this.rank = rank;
    }

    public String getSuit() {
        return SUIT.get(suit).name();
    }

    public String getRank() {
        return ((rank < 2 || rank > 10) ? RANK.get(rank).name() : String.valueOf(rank));
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + SUIT.get(suit) +
                ", rank=" + ((rank < 2 || rank > 10) ? RANK.get(rank) : rank) +
                '}';
    }
}
