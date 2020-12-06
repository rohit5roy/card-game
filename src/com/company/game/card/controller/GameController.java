package com.company.game.card.controller;

import com.company.game.card.service.DeckService;
import com.company.game.card.service.impl.DeckServiceImpl;

public class GameController {

    // Possible STEPS in the game
    public static enum STEP {
        START(1),
        PLAY_CARD(2),
        RESHUFFLE(3),
        RESTART(4);

        private int stepId;
        STEP(int _stepId){
            stepId = _stepId;
        }
        public int getStepId() {
            return stepId;
        }
    }

    private final DeckService deckService;

    public GameController(){
        deckService = new DeckServiceImpl();
    }

    private void startGame(){
        deckService.startGame();
        System.out.println(":::::::::::::GAME STARTED:::::::::::::");
        deckService.gameStatus();
    }

    private void playCard(){
        deckService.playCardFromTop();
        System.out.println(":::::::::::::PLAYED CARD:::::::::::::");
        deckService.gameStatus();
    }

    private void reshuffleDeck(){
        deckService.shuffleRemainingDeck();
        System.out.println(":::::::::::::RE-SHUFFLED:::::::::::::");
        deckService.gameStatus();
    }

    private void restartGame(){
        deckService.restartGame();
        System.out.println(":::::::::::::GAME RESTARTED:::::::::::::");
        deckService.gameStatus();
    }

    public void playStep(STEP step){
        switch (step){
            case START: startGame(); break;
            case PLAY_CARD: playCard(); break;
            case RESHUFFLE: reshuffleDeck(); break;
            case RESTART: restartGame(); break;
            default:
                System.out.println("WRONG INPUT");
        }
    }
}
