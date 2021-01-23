package edu.rogachova.water;

import edu.rogachova.description.Danger;
import edu.rogachova.description.WaterType;

public class Stream extends Hydrosphere
{
    private WaterType waterType;
    private double nWater;

    public Stream(double nWater){
        waterType = WaterType.STREAM;
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
        System.out.println("Канавки стали ручьями");
        nWater *= 3;
        System.out.println("Ручьи наполнились водой");
    }
}
