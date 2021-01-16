package edu.Rogachova.description;

public class Danger
{
    private String danger;

    public Danger(){
        this.danger ="";
    }

    public String getDanger()
    {
        return danger;
    }

    public void setDanger(String danger)
    {
        this.danger = danger;
    }

    @Override
    public String toString()
    {
        return "Danger{" +
                "danger='" + danger + '\'' +
                '}';
    }

    @Override
    public int hashCode(){
        return danger.hashCode();
    }

    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject){
            return true;
        }

        if(otherObject == null){
            return false;
        }

        if(otherObject instanceof Danger){
            Danger newDanger = (Danger)otherObject;
            return this.danger.equals(newDanger.hashCode());
        }
        return false;
    }
}
