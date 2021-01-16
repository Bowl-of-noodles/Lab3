package edu.Rogachova.description;

import edu.Rogachova.ability.Flowable;

import java.util.Objects;

public class Hydrosphere implements Flowable
{
    private WaterType waterType;
    private Danger danger;

    public Hydrosphere(WaterType waterType)
    {
        this.waterType = waterType;
    }

    public WaterType getWaterType()
    {
        return waterType;
    }

    public void setWaterType(WaterType waterType)
    {
        this.waterType = waterType;
    }

    public void setDanger(Danger danger){
        this.danger = danger;
    }

    @Override
    public void startToFlow()
    {
        if(danger.getDanger().equals("FLOOD")){
            System.out.println("And then the flood begin");
        }


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
