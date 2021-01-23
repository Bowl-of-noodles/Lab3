package edu.rogachova.water;

import edu.rogachova.ability.ReasonToWorry;
import edu.rogachova.description.Danger;
import edu.rogachova.description.WaterType;

public class Groove extends Hydrosphere
{
    private WaterType waterType;
    private double nWater;
    private String name;
    private boolean isVisited;

    public Groove(double amountOfWater){
        waterType = WaterType.GROOVE;
        nWater = amountOfWater;
    }

    public WaterType getWaterType()
    {
        return waterType;
    }

    public double getnWater()
    {
        return nWater;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean getIsVisited()
    {
        return isVisited;
    }

    public void setIfVisited(boolean is){
        this.isVisited = is;
    }

    @Override
    public void startToFlow()
    {
        System.out.println("And then the flood begin");
        nWater *= 2;
        System.out.println("Канавки наполнились водой");
    }
}
