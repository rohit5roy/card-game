package com.company.game.card.model;

import java.util.HashMap;
import java.util.Map;

public enum SUIT {
    HEART(1),
    DIAMOND(2),
    CLUB(3),
    SPADE(4);

    private final int suitId;
    SUIT(int _suitId){
        suitId = _suitId;
    }
    public int getId() {
        return suitId;
    }
    //****** Reverse Lookup Implementation************//
    //Lookup table
    private static final Map<Integer, SUIT> lookup = new HashMap<>();

    //Populate the lookup table on loading time
    static
    {
        for(SUIT suit : SUIT.values())
        {
            lookup.put(suit.getId(), suit);
        }
    }
    //This method can be used for reverse lookup purpose
    public static SUIT get(Integer suitId)
    {
        return lookup.get(suitId);
    }
}
