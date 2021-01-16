package edu.Rogachova;

import edu.Rogachova.ability.ThoughtType;
import edu.Rogachova.description.WaterType;

import java.util.Random;


public class RandomPicking
{
    private ThoughtType thoughtType;
    private WaterType waterType;

    public RandomPicking()
    {
    }

    public ThoughtType pickThought(){
        Random random = new Random();
        int rnd = random.nextInt(3);
        switch (rnd){
            case 0: thoughtType = ThoughtType.ANXIETY;
                    break;
            case 1: thoughtType = ThoughtType.DREAMINESS;
                break;
            case 2: thoughtType = ThoughtType.MELANCHOLY;
                break;
        }
        return thoughtType;
    }

    public WaterType pickWaterType(){
        Random random = new Random();
        int rnd = random.nextInt(4);
        switch (rnd){
            case 0: waterType = WaterType.RIVER;
                break;
            case 1: waterType = WaterType.FLOOD;
                break;
            case 2: waterType = WaterType.STREAM;
                break;
            case 3: waterType = WaterType.PUDDLE;
                break;
            case 4: waterType = WaterType.WATERFLOW;
                break;
        }
        return waterType;
    }
}
