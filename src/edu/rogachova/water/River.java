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
    
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof River)) return false;
        if (!super.equals(o)) return false;
        River river = (River) o;
        return Double.compare(river.getnWater(), getnWater()) == 0 &&
                getWaterType() == river.getWaterType();
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getWaterType(), getnWater());
    }

    @Override
    public String toString()
    {
        return "River{" +
                "waterType=" + waterType +
                ", nWater=" + nWater +
                '}';
    }
}
