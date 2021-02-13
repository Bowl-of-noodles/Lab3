package edu.rogachova;

import edu.rogachova.ability.ReasonToWorry;
import edu.rogachova.description.*;
import edu.rogachova.entities.Piglet;
import edu.rogachova.water.Flood;
import edu.rogachova.water.WaterLevel;
import edu.rogachova.water.Groove;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Piglet piglet = new Piglet("Пяточок", new Home("Дом пяточка"));

        System.out.println("Введите количество канавок");
        Scanner scannerInt = new Scanner(System.in);
        int nOfGrooves = scannerInt.nextInt();
        Groove[] grooves = new Groove[nOfGrooves];

        for(int i = 0; i < grooves.length; i++){
            grooves[i] = new Groove();
            String number = Integer.toString(i + 1);
            grooves[i].setName("Канавка " + number);
        }
        piglet.wasInTheWater(grooves);


        piglet.recollectMemories();
        piglet.toBeInTheirHome();


        System.out.println();
        System.out.println("Введите уровень воды");
        Scanner scannerDouble = new Scanner(System.in);
        double amountOfWater = scannerDouble.nextDouble();
        for(Groove groove: piglet.getWhatGrooveVisited())
        {
            groove.setnWater(amountOfWater);
        }

        WaterLevel waterLevel = new WaterLevel();
        boolean beginingOfFlood = waterLevel.changeWaterLevel(piglet, piglet.getWhatGrooveVisited());
        if(beginingOfFlood){
            Danger danger = new Danger();
            Flood flood = new Flood();
            danger.setDanger(ReasonToWorry.FLOOD);
            flood.startFlood(danger, piglet);
        }

    }
}
