package edu.rogachova.entities;

import edu.rogachova.ability.MoveableInWater;
import edu.rogachova.ability.ReasonToWorry;
import edu.rogachova.ability.Worriable;
import edu.rogachova.description.Home;
import edu.rogachova.water.Groove;

import java.util.ArrayList;
import java.util.Objects;


public class Piglet extends Character implements Worriable, MoveableInWater
{

    private Home home;
    private ReasonToWorry reason;
    private Groove[] visitedGrooves;

    public Piglet(String name, Home home){
        super(name);
        this.home = home;
    }


    public Home getHome(){
        return home;
    }


    @Override
    public void wasInTheWater(Groove[] grooves){
        //int numberOfVisited = grooves.length/2;
        visitedGrooves = new Groove[grooves.length/2+1];
        int number = 0;
        for(int i = 0; i < grooves.length; i++){
            if(i % 2 == 0){
                grooves[i].setIfVisited(true);
                visitedGrooves[number] = grooves[i];
                number++;
            }
            else{
                grooves[i].setIfVisited(false);
            }
        }
    }

    @Override
    public boolean isVisitedGroove(Groove groove){
        boolean state = false;
        for (Groove checkedGroove : visitedGrooves)
        {
            if (checkedGroove.equals(groove)){
                state = true;
            }
        }
        return state;
    }

    @Override
    public Groove[] getWhatGrooveVisited(){
        return visitedGrooves;
    }


    @Override
    public void recollectMemories(){
        ArrayList<String> names = new ArrayList<String>();
        for(int i=0; i<visitedGrooves.length; i++){
            names.add(visitedGrooves[i].getName());
        }
        System.out.print("\nПяточек вспоминал, как он прыгал через ");
        for(String name: names){
            System.out.print("\t" + name);
        }

    }

    @Override
    public void startToWorry(){
        System.out.println("Пятачок начал беспокоится, нужно проверить количество воды");
        this.getHome().checkAmountOfWater();
    }

    public void toBeInTheirHome()
    {
         home.setOwner(this);
    }

    @Override
    public void startToThink(){
        System.out.println("Пяточек увидел, как сильно поднялся уровень воды. Он начал боятся, что его дом затопит");
    }


   @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character character = (Character) obj;
        return this.getName().equals(character.getName());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(super.hashCode(), home, reason);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + this.getName() + '\'' +
                ", location=" + home.getName() +
                '}';
    }
}
