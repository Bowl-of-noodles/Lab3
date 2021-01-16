package edu.Rogachova.entities;

import edu.Rogachova.ability.ReasonToWorry;
import edu.Rogachova.ability.ThoughtType;
import edu.Rogachova.ability.Worriable;
import edu.Rogachova.description.Home;

import java.util.Objects;


public class Piglet extends Character implements Worriable
{

    private Home home;
    private ThoughtType thoughtType;
    private ReasonToWorry reason;

    public Piglet(String name, Home home){
        super(name);
        this.home = home;
    }


    public Home getHome(){
        return home;
    }

    public void setThoughtType(ThoughtType thoughtType){
        this.thoughtType = thoughtType;
    }



    @Override
    public void recollectMemories(){
        if (thoughtType == ThoughtType.MELANCHOLY){
            System.out.println("I have no worries, I'm just sad");
        }
        else if (thoughtType == ThoughtType.ANXIETY){
            System.out.println("How can I stay calm?! I'm afraid of water!");
            findReasonToWorry();
        }
        else {
            System.out.println("I need to think longer");
        }

    }

    @Override
    public void findReasonToWorry(){
        switch(thoughtType){
            case MELANCHOLY: reason = ReasonToWorry.LONELINESS;
                break;
            case DREAMINESS: reason = ReasonToWorry.HEFFALUMPS;
                break;
            case ANXIETY: reason = ReasonToWorry.FLOODDANGER;
                System.out.println("What if my house is flooded?!");
                toBeInTheirHome();
                home.checkAmountOfWater();
                break;
            case HAPPINESS: System.out.println("I have no reasons to worry");
                break;
        }
    }

    private void toBeInTheirHome()
    {
         home.setOwner(this);
    }

    @Override
    public void startToThink(){
        System.out.println(this.getName() + " remembered how he often jumped over " + home.getHydrosphere().getWaterType() );
    }

    public void escapeFromHome(){
        System.out.println(this.getName() + " starts to escape from  " + home.getName());
    }

   @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character character = (Character) obj;
        return this.getName().equals(character.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPlace());
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + this.getName() + '\'' +
                ", location=" + home.getName() +
                '}';
    }
}
