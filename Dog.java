public class Dog extends Animal implements Land
{

    // Constructor
    public Dog(boolean mammals, boolean carnivorous, int mood)
    {
        super(mammals, carnivorous, mood);
    }

    //Dogs usually say
    public void sayHello()
    {
        System.out.println("wagging their tails");
    }

    //Dog say according to his mood
    public void sayHello(int mood)
    {
        if(mood==MOOD_HAPPY)
            System.out.println("bark loudly");
        else
            System.out.println("whooping sound");
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
    // return ("Dog -> mammals: " + this.mammals + " carnivorous:  "+ this.carnivorous + " mood:  "+ this.mood);
    // }

}
