package edu.Rogachova;

import edu.Rogachova.ability.ThoughtType;
import edu.Rogachova.description.*;
import edu.Rogachova.entities.Piglet;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RandomPicking newPick = new RandomPicking();
        WaterType waterType = newPick.pickWaterType();
        Danger danger = new Danger();

        System.out.println("Water type: " + waterType);//для проверки результата

        Piglet piglet = new Piglet("Пятачок", new Home("Дом пяточка", new Hydrosphere(waterType), danger));
        ThoughtType newType = newPick.pickThought();
        System.out.println("Mood: " + newType);
        piglet.setThoughtType(newType);
        //piglet.setThoughtType(ThoughtType.ANXIETY);

        piglet.recollectMemories();

        Outdoors outdoors = new Outdoors("Forest");
        ArrayList<WaterType> waterTypes = new ArrayList<WaterType>();
        for(int i=0; i<3; i++){
            waterTypes.add(newPick.pickWaterType());
        }

        if(piglet.getHome().getDangerDescription().equals("FLOOD")){
            piglet.escapeFromHome();
            outdoors.description(waterTypes);
        }





    }
}
