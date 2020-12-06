package com.company.game.card.service;

import com.company.game.card.model.Card;

public interface DeckService {

    void startGame();
    void playCardFromTop();
    void shuffleRemainingDeck();
    void restartGame();
    void gameStatus();
}
