
/**
 * Abstract class Animal
 *
 * @author (Rachel Gantz)
 * @version (30/05/2022)
 */
public abstract class Animal
{
    // instance variables 
    protected boolean mammals;
    protected boolean carnivorous;
    protected int mood;
    final static int MOOD_HAPPY = 1;
    final static int MOOD_SCARE = 0;

    public Animal(boolean mammals, boolean carnivorous, int mood)
    {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    //Animal usually say
    public void sayHello(){};
    //Animal say according to his mood
    public abstract void sayHello(int a);
    //return if he is a mmmal or not
    public abstract boolean isMammals();
    //sets the attribute mammal to true or false
    public abstract void setMammals(boolean mammals);
    //return if he is a carnivorous or not
    public abstract boolean isCarnivorous();
    //sets the attribute carnivorous to true or false
    public abstract void setCarnivorous(boolean carnivorous);

}
