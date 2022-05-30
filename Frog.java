public class Frog extends Animal implements Land, Water
{

    // Constructor
    public Frog(boolean mammals, boolean carnivorous, int mood)
    {
        super(mammals, carnivorous, mood);
    }

    //Frog say according to his mood
    public  void sayHello(int mood)
    {
        if(mood==MOOD_HAPPY)
            System.out.println("quack quack quack");
        else
            System.out.println("plop into the water");
    }

    public boolean isMammals()
    {
        return this.mammals;
    }

    public void setMammals(boolean mammals)
    {
        this.mammals = mammals;
    }

    public boolean isCarnivorous()
    {
        return this.carnivorous;
    }

    public void setCarnivorous(boolean carnivorous)
    {
        this.carnivorous = carnivorous;
    }

    //return the attribute numberOfLegs
    public int getNumberOfLegs()
    {
        return this.numberOfLegs;
    }

    public boolean hasGills()
    {
        return false;
    }

    public boolean hasLayEggs()
    {
        return true;
    }

    // public String toString()
    // {
    // return ("Frog -> mammals: " + this.mammals + " carnivorous:  "+ this.carnivorous + " mood:  "+ this.mood);
    // }

}
