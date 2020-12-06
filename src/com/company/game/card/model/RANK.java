package com.company.game.card.model;


import java.util.HashMap;
import java.util.Map;

public enum RANK {
    ACE(1),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int rankId;
    RANK(int _rankId){
        rankId = _rankId;
    }
    public int getId() {
        return rankId;
    }

    //****** Reverse Lookup Implementation************//
    //Lookup table
    private static final Map<Integer, RANK> lookup = new HashMap<>();

    //Populate the lookup table on loading time
    static
    {
        for(RANK rank : RANK.values())
        {
            lookup.put(rank.getId(), rank);
        }
    }
    //This method can be used for reverse lookup purpose
    public static RANK get(Integer suitId)
    {
        return lookup.get(suitId);
    }
}
