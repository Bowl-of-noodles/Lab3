package edu.rogachova.water;

import edu.rogachova.description.Danger;
import edu.rogachova.description.WaterType;
import edu.rogachova.entities.Piglet;

public class Flood
{
    Danger danger;
    public Flood(){

    }

    public void startFlood(Danger danger, Piglet piglet){
        this.danger = danger;
        System.out.println("Снаружи началось наводнение");
        piglet.getHome().setDanger(danger);
        piglet.getHome().setWaterType(WaterType.FLOOD);
        piglet.startToWorry();
    }
}
