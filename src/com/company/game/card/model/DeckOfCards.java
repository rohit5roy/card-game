package com.company.game.card.model;

import java.util.ArrayList;
import java.util.List;


public class DeckOfCards {

    private List<Card> cardsAvailable = new ArrayList<>(52);
    private List<Card> cardsPlayed = new ArrayList<>(0);

    private static volatile DeckOfCards instance;

    /** private constructor to prevent others from instantiating this class */
    private DeckOfCards() {}

    /** Initialize the singleton lazily in a synchronized block */
    public static DeckOfCards getInstance() {
        if(instance == null) {
            synchronized (DeckOfCards.class) {
                // double-check
                if(instance == null) {
                    instance = new DeckOfCards();
                }
            }
        }
        return instance;
    }

    public List<Card> getCardsAvailable() {
        return cardsAvailable;
    }

    public void setCardsAvailable(List<Card> cardsAvailable) {
        this.cardsAvailable = cardsAvailable;
    }

    public List<Card> getCardsPlayed() {
        return cardsPlayed;
    }

    public void setCardsPlayed(List<Card> cardsPlayed) {
        this.cardsPlayed = cardsPlayed;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("DeckOfCards{" +
                "cardsAvailable=");
        for(Card card : cardsAvailable)
            res.append(card.toString());
        res.append(", cardsPlayed=");
        for(Card card : cardsPlayed)
            res.append(card.toString());
        res.append("}")
                .append(", cardsAvailable size=").append(cardsAvailable.size())
                .append(", cardsPlayed size=").append(cardsPlayed.size());
        return res.toString();
    }
}
