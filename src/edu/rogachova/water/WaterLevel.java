package edu.rogachova.water;

import edu.rogachova.ability.ReasonToWorry;
import edu.rogachova.description.Danger;
import edu.rogachova.description.WaterType;
import edu.rogachova.entities.Piglet;

public class WaterLevel
{
    private int highLevel;
    
    public WaterLevel(int highLevel){
         if(highLevel != 0){
            this.highLevel = highLevel;
        }
        else{this.highLevel = 30;}
    }

    public boolean changeWaterLevel(Piglet piglet, Groove[] grooves){
        System.out.println("\nУровень воды стал повышаться");
        boolean beginingOfFlood = false;
        Danger danger = new Danger();
        danger.setDanger(ReasonToWorry.FLOOD);
        for(Groove groove:grooves)
        {
            groove.startToFlow();
        }
        Stream stream = new Stream(grooves[0].getnWater());
        stream.startToFlow();
        River river = new River(stream.getnWater());
        river.startToFlow();
        if(river.getnWater() >= highLevel){
            System.out.println("Река вышла из своих берегов");
            beginingOfFlood = true;
        }
        else{
            piglet.getHome().setDanger(danger);
            piglet.getHome().setWaterType(WaterType.RIVER);
            piglet.startToWorry();
            System.out.println("Но воды еще было недостаточно для наводнения");
        }
        return beginingOfFlood;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof WaterLevel)) return false;
        WaterLevel that = (WaterLevel) o;
        return highLevel == that.highLevel;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(highLevel);
    }

    @Override
    public String toString()
    {
        return "WaterLevel{" +
                "highLevel=" + highLevel +
                '}';
    }
}
