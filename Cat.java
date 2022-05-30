
public class Cat extends Animal implements Land
{
    // Constructor
    public Cat(boolean mammals, boolean carnivorous, int mood)
    {
        super(mammals, carnivorous, mood);
    }

    //Cats usually say
    public  void sayHello()
    {
        System.out.println("mewo");
    }

    //Cat say according to his mood
    public  void sayHello(int mood)
    {
        if(mood == MOOD_HAPPY)
            System.out.println("purr, purr");
        else
            System.out.println("hiss");
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

    // public String toString()
    // {
    // return ("Cat -> mammals: " + this.mammals + " carnivorous:  "+ this.carnivorous + " mood:  "+ this.mood);
    // }
}
