package edu.rogachova;

import edu.rogachova.description.*;
import edu.rogachova.entities.Piglet;
import edu.rogachova.water.Flood;
import edu.rogachova.water.Groove;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Piglet piglet = new Piglet("Пяточок", new Home("Дом пяточка"));

        Scanner scannerInt = new Scanner(System.in);
        int nOfGrooves = scannerInt.nextInt();
        Groove[] grooves = new Groove[nOfGrooves];
        int howMuchVisited = 0;

        for(int i = 0; i < grooves.length; i++){
            grooves[i] = new Groove(1);
            String number = Integer.toString(i + 1);
            grooves[i].setName("Канавка " + number);
            if(i % 2 == 0){
                grooves[i].setIfVisited(true);
                howMuchVisited++;
            }
            else{
                grooves[i].setIfVisited(false);
            }
        }


        if(howMuchVisited > 0){
            piglet.whatSee(grooves);
            piglet.recollectMemories();
        }



        piglet.toBeInTheirHome();
        Flood flood = new Flood();

        System.out.println();
        Scanner scannerDouble = new Scanner(System.in);
        double amountOfWater = scannerDouble.nextDouble();
        Groove groove = new Groove(amountOfWater);
        flood.floodStart(groove, piglet);






    }
}
