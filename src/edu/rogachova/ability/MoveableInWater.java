package edu.rogachova.ability;

import edu.rogachova.water.Groove;

public interface MoveableInWater
{
    void wasInTheWater(Groove[] grooves);
    boolean isVisitedGroove(Groove groove);
    Groove[] getWhatGrooveVisited();
}
