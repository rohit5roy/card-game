package com.company.game.card.service.impl;

import com.company.game.card.model.DeckOfCards;
import com.company.game.card.service.DeckService;
import com.company.game.card.util.CommonActions;

import java.util.ArrayList;

import static com.company.game.card.util.CommonActions.initCompleteDeck;
import static com.company.game.card.util.CommonActions.shuffleDeck;

public class DeckServiceImpl implements DeckService {

    DeckOfCards deckInstance = null;

    @Override
    public void startGame() {
        deckInstance = DeckOfCards.getInstance();
        deckInstance.setCardsAvailable(shuffleDeck(initCompleteDeck()));
        deckInstance.setCardsPlayed(new ArrayList<>(0));
    }

    @Override
    public void playCardFromTop() {
        if(deckInstance == null || deckInstance.getCardsAvailable().get(0) == null)
            throw new IllegalStateException("Deck is not yet initialized.");

        CommonActions.playCardFromTop(deckInstance.getCardsAvailable(), deckInstance.getCardsPlayed());
    }

    @Override
    public void shuffleRemainingDeck() {
        shuffleDeck(deckInstance.getCardsAvailable());
    }

    @Override
    public void restartGame() {
        deckInstance.setCardsAvailable(shuffleDeck(initCompleteDeck()));
        deckInstance.setCardsPlayed(new ArrayList<>(0));
    }

    @Override
    public void gameStatus() {
        System.out.println("-------------STATUS START-------------");
        System.out.println(deckInstance.toString());
        System.out.println("-------------STATUS END-------------\n");
    }
}
