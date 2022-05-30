/**
 * This is a driver for the classes: Date, Person, and Group
 *
 * @author rachel ganth
 * @version 28/03/2020
 */

public class TestAnimal
{

    public static void main(String[] args)
    { 

        Dog dog=new Dog(true,true,1);
        Cat cat=new Cat(true,true,1);
        Frog frog=new Frog(false,false,1);

        //Test Dog
        System.out.print("Dogs usually greet people by: ");
        dog.sayHello();

        System.out.print("When they feel comfortable being touched, they will: ");
        dog.sayHello(1);

        System.out.print("When they are frightened and upset, they will: ");
        dog.sayHello(0);

        dog.setMammals(true);
        System.out.println("The Dog is Mammals? " + dog.isMammals());

        dog.setCarnivorous(true);
        System.out.println("The Dog is Carnivorous? " + dog.isCarnivorous());

        System.out.println("The Dog have: " + dog.getNumberOfLegs() + " legs");
        System.out.println("");

        
        //Test Cat
        System.out.print("Cats usually make a: ");
        cat.sayHello();

        System.out.print("when they are in a good mood, they make a: ");
        cat.sayHello(1);

        System.out.print("when they are frightened, they make a: ");
        cat.sayHello(0);

        cat.setMammals(true);
        System.out.println("The Cat is Mammals? " + cat.isMammals());

        cat.setCarnivorous(true);
        System.out.println("The Cat is Carnivorous? " + cat.isCarnivorous());

        System.out.println("The Cat have: " + cat.getNumberOfLegs() + " legs");
        System.out.println("");

        
        //Test Frog
        System.out.print("When the frog is in a good mood, it will sing: ");
        frog.sayHello(1);

        System.out.print("when frightened, it will : ");
        frog.sayHello(0);

        frog.setMammals(false);
        System.out.println("The Frog is Mammals? " + frog.isMammals());

        frog.setCarnivorous(false);
        System.out.println("The Frog is Carnivorous? " + frog.isCarnivorous());

        System.out.println("The Frog have: " + frog.getNumberOfLegs() + " legs");
        System.out.println("");
        
        System.out.println("The Frog has Gills? " + frog.hasGills());
        System.out.println("The Frog has Lay Eggs: " + frog.hasLayEggs());
        
        
        
    }
}
