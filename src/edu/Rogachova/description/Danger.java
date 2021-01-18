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
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Danger)) return false;
        Danger danger1 = (Danger) o;
        return Objects.equals(danger, danger1.danger);
    }
}
