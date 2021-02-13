package edu.rogachova.water;

import edu.rogachova.description.Danger;
import edu.rogachova.description.WaterType;

public class River extends Hydrosphere
{
    private WaterType waterType;
    private double nWater;

    public River(double nWater){
        waterType = WaterType.RIVER;
        if (nWater != 0)
        {
            this.nWater = nWater;
        }
        else{
            this.nWater = 1;
        }

    }

    public WaterType getWaterType()
    {
        return waterType;
    }

    public double getnWater()
    {
        return nWater;
    }

    @Override
    public void startToFlow()
    {
        System.out.println("Ручьи превратились в реку");
        nWater *= 5;
        System.out.println("Река наполнилась водой");
    }
}
