package edu.rogachova.water;

import edu.rogachova.description.WaterType;

import java.util.Objects;

public class Stream extends Hydrosphere
{
    private double nWater;

    public Stream(double nWater){
        setWaterType(WaterType.STREAM);
        if (nWater != 0)
        {
            this.nWater = nWater;
        }
        else{
            this.nWater = 1;
        }
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Stream)) return false;
        if (!super.equals(o)) return false;
        Stream stream = (Stream) o;
        return Double.compare(stream.getnWater(), getnWater()) == 0 &&
                getWaterType() == stream.getWaterType();
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(getWaterType(), getnWater());
    }

    @Override
    public String toString()
    {
        return "Stream{" +
                "waterType=" + getWaterType() +
                ", nWater=" + nWater +
                '}';
    }
}
