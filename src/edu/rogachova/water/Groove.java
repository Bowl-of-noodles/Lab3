package edu.rogachova.water;

import edu.rogachova.description.WaterType;

public class Groove extends Hydrosphere
{
    private WaterType waterType;
    private double nWater;
    private String name;
    private boolean isVisited;

    public Groove(){
        waterType = WaterType.GROOVE;
    }

    public WaterType getWaterType()
    {
        return waterType;
    }

    public double getnWater()
    {
        return nWater;
    }

    public void setnWater(double nWater){
        this.nWater = nWater;
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
        nWater *= 2;
        System.out.println("Канавка наполнилась водой");
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Groove)) return false;
        if (!super.equals(o)) return false;
        Groove groove = (Groove) o;
        return isVisited == groove.isVisited &&
                Objects.equals(name, groove.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), name, isVisited);
    }

    @Override
    public String toString()
    {
        return "Groove{" +
                "waterType=" + waterType +
                ", nWater=" + nWater +
                ", name='" + name + '\'' +
                ", isVisited=" + isVisited +
                '}';
    }
}
