package com.company.game.card;

import com.company.game.card.controller.GameController;

public class Main {

    public static void main(String[] args) {


        GameController controller = new GameController();
        controller.playStep(GameController.STEP.START);
        controller.playStep(GameController.STEP.PLAY_CARD);
        controller.playStep(GameController.STEP.PLAY_CARD);
        controller.playStep(GameController.STEP.PLAY_CARD);
        controller.playStep(GameController.STEP.RESHUFFLE);
        controller.playStep(GameController.STEP.RESTART);
    }
}
