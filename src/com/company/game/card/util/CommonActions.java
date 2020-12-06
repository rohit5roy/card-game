package com.company.game.card.util;

import com.company.game.card.model.Card;
import com.company.game.card.model.SUIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonActions {

    //Shuffling the cards in a list
    public static List<Card> shuffleDeck(List<Card> cards){
        Random rand = new Random();
        for (int i = 0; i < cards.size(); i++)
        {
            // Random for remaining positions.
            int r = i + rand.nextInt(cards.size() - i);
            //swapping the elements
            Card temp = cards.get(r);
            cards.set(r, cards.get(i));
            cards.set(i, temp);
        }
        return cards;
    }

    //initializing the complete deck in order
    public static List<Card> initCompleteDeck(){
        List<Card> cards = new ArrayList<>(52);
        int c=0;
        for(SUIT suit : SUIT.values()){
            for(int i = 1; i <= 13; i++) {
                cards.add(new Card(suit, i));
            }
        }
        return cards;
    }

    //Playing the card from the TOP of the deck.
    public static void playCardFromTop(List<Card> cardsAvailable, List<Card> cardsPlayed){
        Card card = cardsAvailable.get(0);
        cardsAvailable.remove(0);
        cardsPlayed.add(card);
    }
}
