package edu.Rogachova.description;

import edu.Rogachova.entities.Character;

import java.util.Objects;

public class Home extends Place
{
    private String name;
    private Boolean isFlooded;
    private Character owner;
    private Hydrosphere hydrosphere;
    private Danger danger;

    public Home(String name, Hydrosphere hydrosphere, Danger danger){
        super(name);
        this.hydrosphere = hydrosphere;
        this.danger = danger;
    }


    public Hydrosphere getHydrosphere()
    {
        return hydrosphere;
    }

    public void setOwner(Character owner)
    {
        this.owner = owner;
    }


    public Character getOwner(){
        return owner;
    }

    public String getDangerDescription(){
        return danger.getDanger();
    }

    @Override
    public void checkAmountOfWater(){
        if (hydrosphere.getWaterType().equals(WaterType.FLOOD)) {
            isFlooded = true;
            System.out.println("There is water in my house!");
            danger.setDanger("FLOOD");
        }
        else if((hydrosphere.getWaterType().equals(WaterType.STREAM)) || (hydrosphere.getWaterType().equals(WaterType.PUDDLE))){
            System.out.println("No, it's fine.");
            owner.startToThink();
            danger.setDanger("No danger");

        }
        else{
            System.out.println("There is no water. It's better to sleep.");
            danger.setDanger("No danger");
        }
    }


    @Override
    public String toString()
    {
        return "Home{" +
                "name='" + name + '\'' +
                ", isFlooded=" + isFlooded +
                ", owner=" + owner +
                ", hydrosphere=" + hydrosphere +
                ", danger=" + danger +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Home)) return false;
        Home home = (Home) o;
        return Objects.equals(name, home.name) &&
                Objects.equals(isFlooded, home.isFlooded) &&
                Objects.equals(owner, home.owner) &&
                Objects.equals(hydrosphere, home.hydrosphere) &&
                Objects.equals(danger, home.danger);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(name, isFlooded, owner, hydrosphere, danger);
    }
}
