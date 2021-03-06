package edu.rogachova.water;

import edu.rogachova.ability.Flowable;
import edu.rogachova.ability.ReasonToWorry;
import edu.rogachova.description.Danger;
import edu.rogachova.description.WaterType;

import java.util.Objects;

public class Hydrosphere implements Flowable
{
    private WaterType waterType;
    private Danger danger;

    public Hydrosphere()
    {

    }

    public WaterType getWaterType()
    {
        return waterType;
    }

    public final void setWaterType(WaterType waterType)
    {
        this.waterType = waterType;
    }


    @Override
    public void startToFlow()
    {
        System.out.println("Воды стало больше");
    }

    @Override
    public String toString()
    {
        return "Hydrosphere{" +
                "waterType=" + waterType +
                ", danger=" + danger +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Hydrosphere)) return false;
        Hydrosphere that = (Hydrosphere) o;
        return waterType == that.waterType &&
                Objects.equals(danger, that.danger);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(waterType, danger);
    }
}
