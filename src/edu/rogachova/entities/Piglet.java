package edu.rogachova.entities;

import edu.rogachova.ability.ReasonToWorry;
import edu.rogachova.ability.Worriable;
import edu.rogachova.description.Home;
import edu.rogachova.water.Groove;

import java.util.ArrayList;
import java.util.Objects;


public class Piglet extends Character implements Worriable
{

    private Home home;
    private ReasonToWorry reason;
    private Groove[] grooves;

    public Piglet(String name, Home home){
        super(name);
        this.home = home;
    }


    public Home getHome(){
        return home;
    }

    public void whatSee(Groove ... grooves){
        this.grooves = grooves;
    }

    @Override
    public void recollectMemories(){
        ArrayList<String> names = new ArrayList<String>();
        for(int i=0; i<grooves.length; i++){
            if(grooves[i].getIsVisited()){
                names.add(grooves[i].getName());
            }
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
