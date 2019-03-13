
/**
 * Write a description of class AnimalMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalMain
{
    public static void main(String [] args)
    {
        Animal a = new Animal(true, 7, 6, "Female");
        
        a.locomote();
        a.eat();
        a.loseLeg();
        
        Dog b = new Dog(true, "male", false, "mutt");
        b.locomote();
        b.eat();
        b.loseLeg();
        b.wagTail();
        b.bork();
    }
}
