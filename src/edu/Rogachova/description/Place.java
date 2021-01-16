package edu.Rogachova.description;

public class Place
{
    private String name;
    private Boolean isFlooded;
    private Hydrosphere hydrosphere;

    protected Place(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWaterType(Hydrosphere hydrosphere){
        this.hydrosphere = hydrosphere;
    }

    public void checkAmountOfWater(){
        if (hydrosphere.getWaterType() == WaterType.FLOOD) {
            isFlooded = true;
        }
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject){
            return true;
        }

        if(otherObject == null){
            return false;
        }

        if(otherObject instanceof Place){
            Place place2 = (Place)otherObject;
            return this.name.equals(place2.name);
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Place{" +
                "name='" + name + '\'' +
                ", isFlooded=" + isFlooded +
                ", hydrosphere=" + hydrosphere +
                '}';
    }
}
