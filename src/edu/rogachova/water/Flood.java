package edu.rogachova.water;

import edu.rogachova.ability.ReasonToWorry;
import edu.rogachova.description.Danger;
import edu.rogachova.description.WaterType;
import edu.rogachova.entities.Piglet;

public class Flood
{
    public Flood(){

    }

    public void floodStart(Groove groove,Piglet piglet){
        Danger danger = new Danger();
        danger.setDanger(ReasonToWorry.FLOOD);
        groove.startToFlow();
        Stream stream = new Stream(groove.getnWater());
        stream.startToFlow();
        River river = new River(stream.getnWater());
        river.startToFlow();
        if(river.getnWater()>=30){
            piglet.getHome().setDanger(danger);
            piglet.getHome().setWaterType(WaterType.FLOOD);
            System.out.println("Реки выщди за свои берега. Началось наводнение");
        }
        else{

            piglet.getHome().setDanger(danger);
            piglet.getHome().setWaterType(WaterType.RIVER);
            System.out.println("Но воды еще было недостаточно для наводнения");
        }
        piglet.startToWorry();
    }
}
